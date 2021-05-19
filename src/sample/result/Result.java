package sample.result;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Result {
    public Result(){

    }
    @FXML
    private Label winner;
    @FXML
    private Label hathiVote;
    @FXML
    private Label ghoraVote;

    public Label getWinner() {
        return winner;
    }

    public Label getGhoraVote() {
        return ghoraVote;
    }

    public Label getHathiVote() {
        return hathiVote;
    }

    public void setWinner(Label winner) {

    }
}
