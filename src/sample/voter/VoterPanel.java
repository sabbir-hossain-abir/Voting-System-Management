package sample.voter;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;



public class VoterPanel {
    public VoterPanel(){

    }
    public static int voteCountForDemocrat=0;
    public static int voteCountForRepublican=0;
    @FXML
    private CheckBox republicanPartyBox;

    @FXML
    private CheckBox democraticPartyBox;

    @FXML
    private void handleRepublicanParty(){
        if(republicanPartyBox.isSelected()){
            democraticPartyBox.setSelected(false);
            voteCountForRepublican++;
        }
    }
    @FXML
    private void handleDemocraticParty(){
        if (democraticPartyBox.isSelected()){
            republicanPartyBox.setSelected(false);
            voteCountForDemocrat++;
        }
    }

    public static int getVoteCountForDemocrat() {
        return voteCountForDemocrat;
    }

    public static int getVoteCountForRepublican() {
        return voteCountForRepublican;
    }

}
