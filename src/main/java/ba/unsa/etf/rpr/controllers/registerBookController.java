package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class registerBookController {
    public Label bookId;
    public Label memberId;
    public Button closeId;
    private String knjiga, memberid;

    /**
     * When we want to pass information entered in the main window to another
     * we pass it through constructor
     * we did that in sample controller on registerAction
     * @author dbajramovi3
     * @param knjiga
     * @param memberid
     */
    public registerBookController(String knjiga, String memberid){
        this.knjiga = knjiga;
        this.memberid = memberid;
    }

    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) bookId.getScene().getWindow();
        stage.close();
    }

    /**
     *
     */
    @FXML
    public void initialize(){
        bookId.setText(knjiga);
        memberId.setText(memberid);
    }
}
