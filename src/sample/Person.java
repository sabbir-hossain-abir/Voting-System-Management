package sample;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty voterName;
    private SimpleStringProperty voterDateOfBirth;
    private SimpleStringProperty voterSex;
    private SimpleStringProperty voterPhoneNumber;
    private SimpleStringProperty voterVoterID;
    private SimpleStringProperty voterPassword;

    public Person(String voterName, String voterDateOfBirth, String voterSex, String voterPhoneNumber, String voterVoterID, String voterPassword) {
        this.voterName = new SimpleStringProperty(voterName);
        this.voterDateOfBirth = new SimpleStringProperty(voterDateOfBirth);
        this.voterSex = new SimpleStringProperty(voterSex);
        this.voterPhoneNumber = new SimpleStringProperty(voterPhoneNumber);
        this.voterVoterID = new SimpleStringProperty(voterVoterID);
        this.voterPassword = new SimpleStringProperty(voterPassword);
    }

    public String getVoterName() {
        return voterName.get();
    }

    public SimpleStringProperty voterNameProperty() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName.set(voterName);
    }

    public String getVoterDateOfBirth() {
        return voterDateOfBirth.get();
    }

    public SimpleStringProperty voterDateOfBirthProperty() {
        return voterDateOfBirth;
    }

    public void setVoterDateOfBirth(String voterDateOfBirth) {
        this.voterDateOfBirth.set(voterDateOfBirth);
    }

    public String getVoterSex() {
        return voterSex.get();
    }

    public SimpleStringProperty voterSexProperty() {
        return voterSex;
    }

    public void setVoterSex(String voterSex) {
        this.voterSex.set(voterSex);
    }

    public String getVoterPhoneNumber() {
        return voterPhoneNumber.get();
    }

    public SimpleStringProperty voterPhoneNumberProperty() {
        return voterPhoneNumber;
    }

    public void setVoterPhoneNumber(String voterPhoneNumber) {
        this.voterPhoneNumber.set(voterPhoneNumber);
    }

    public String getVoterVoterID() {
        return voterVoterID.get();
    }

    public SimpleStringProperty voterVoterIDProperty() {
        return voterVoterID;
    }

    public void setVoterVoterID(String voterVoterID) {
        this.voterVoterID.set(voterVoterID);
    }

    public String getVoterPassword() {
        return voterPassword.get();
    }

    public SimpleStringProperty voterPasswordProperty() {
        return voterPassword;
    }

    public void setVoterPassword(String voterPassword) {
        this.voterPassword.set(voterPassword);
    }
}
