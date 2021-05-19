package sample.voter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.Main;

public class VoterLogin {
    public VoterLogin(){

    }
    @FXML
    private Button voterLoginButton;
    @FXML
    private TextField voterUsername;
    @FXML
    private PasswordField voterPassword;
    @FXML
    private Label voterLabel;


    public void voterPanel(ActionEvent event) throws Exception{

    }
    public void voterPanelWork(ActionEvent event) throws Exception{
        checkvoterlogin();
    }
    public void checkvoterlogin() throws Exception{
        Main vl=new Main();
        if (voterUsername.getText().toString().equals("voter") && voterPassword.getText().toString().equals("1234")){
            voterLabel.setText("success");
            vl.changeScene("voter/voterPanel.fxml");
        }
        else {
            voterLabel.setText("Please Enter Right Username or Password");
        }

    }
}
