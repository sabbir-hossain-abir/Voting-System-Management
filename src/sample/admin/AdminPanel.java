package sample.admin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import sample.Person;
import javafx.fxml.Initializable;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AdminPanel implements Initializable {
    @FXML
    private Button addVoter;
    @FXML
    private Button removeVoter;

    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person,String> colName;
    @FXML
    private TableColumn<Person, String>colDateOfBirth;
    @FXML
    private TableColumn<Person, String>colSex;
    @FXML
    private TableColumn<Person, String>colPhoneNumber;
    @FXML
    private TableColumn<Person, String>colVoterID;
    @FXML
    private TableColumn<Person, String>colPassword;

    @FXML
    public TextField name;
    @FXML
    public TextField dateOfBirth;
    @FXML
    public TextField sex;
    @FXML
    public TextField phoneNumber;
    @FXML
    public TextField voterID;
    @FXML
    public TextField password;


    @FXML
    public void initialize(URL location, ResourceBundle resources){
        //Sets Up Column to the table
        colName.setCellValueFactory(new PropertyValueFactory<Person, String>("voterName"));
        colDateOfBirth.setCellValueFactory(new PropertyValueFactory<Person,String>("voterDateOfBirth"));
        colSex.setCellValueFactory(new PropertyValueFactory<Person,String>("voterSex"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<Person,String>("voterPhoneNumber"));
        colVoterID.setCellValueFactory(new PropertyValueFactory<Person,String>("voterVoterID"));
        colPassword.setCellValueFactory(new PropertyValueFactory<Person,String>("voterPassword"));

        //loads dummy data
        tableView.setItems(getPeople());

        //Update the table to allow modification
        tableView.setEditable(true);
        colName.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfBirth.setCellFactory(TextFieldTableCell.forTableColumn());
        colSex.setCellFactory(TextFieldTableCell.forTableColumn());
        colPhoneNumber.setCellFactory(TextFieldTableCell.forTableColumn());
        colVoterID.setCellFactory(TextFieldTableCell.forTableColumn());
        colPassword.setCellFactory(TextFieldTableCell.forTableColumn());

        //This will allow select multiple row at once
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    private ObservableList<Person> getPeople() {
        ObservableList<Person> people= FXCollections.observableArrayList();
        people.add(new Person("Sabbir","19/10/1999","Male","019123233","185","0000"));
        people.add(new Person("Protick","21/12/2000","Male","019232333","187","1234"));
        people.add(new Person("Zakaria","01/04/1998","Male","012334555","186","1111"));
        return people;
    }

    //this Method will help admin to double click and edit
    public void changeNameEvent(TableColumn.CellEditEvent edittedCell){
        Person personSelected= tableView.getSelectionModel().getSelectedItem();
        personSelected.setVoterName(edittedCell.getNewValue().toString());
    }
    public void changeDateOfBirthEvent(TableColumn.CellEditEvent edittedCell){
        Person personSelected= tableView.getSelectionModel().getSelectedItem();
        personSelected.setVoterName(edittedCell.getNewValue().toString());
    }
    public void changeSexEvent(TableColumn.CellEditEvent edittedCell){
        Person personSelected= tableView.getSelectionModel().getSelectedItem();
        personSelected.setVoterName(edittedCell.getNewValue().toString());
    }
    public void changePhoneNumberEvent(TableColumn.CellEditEvent edittedCell){
        Person personSelected= tableView.getSelectionModel().getSelectedItem();
        personSelected.setVoterName(edittedCell.getNewValue().toString());
    }
    public void changeVoterIDEvent(TableColumn.CellEditEvent edittedCell){
        Person personSelected= tableView.getSelectionModel().getSelectedItem();
        personSelected.setVoterName(edittedCell.getNewValue().toString());
    }
    public void changePasswordEvent(TableColumn.CellEditEvent edittedCell){
        Person personSelected= tableView.getSelectionModel().getSelectedItem();
        personSelected.setVoterName(edittedCell.getNewValue().toString());
    }


    //Method That will add new voter
   @FXML
    public void addVoter(ActionEvent event){
        Person newPerson=new Person(name.getText(), dateOfBirth.getText(), sex.getText(), phoneNumber.getText(),voterID.getText(),password.getText());

        //get all items from the table as a list and add the new person to the list
        tableView.getItems().add(newPerson);
    }

    //Removes selected rows
    @FXML
    public void removeVoter(ActionEvent event){
        ObservableList<Person> selectedRows, allPeople;
        allPeople= tableView.getItems();

        //Gives rows that were selected
        selectedRows=tableView.getSelectionModel().getSelectedItems();

        //Loop over the selected rows and removes the person object from the table
        for (Person person: selectedRows){
            allPeople.remove(person);
        }
    }


}
