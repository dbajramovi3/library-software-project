package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class registerBookController {
    public Label bookId;
    public Label memberId;
    public Button backId;
    private String knjiga, memberid;
    public registerBookController(String knjiga, String memberid){
        this.knjiga = knjiga;
        this.memberid = memberid;
    }

    @FXML
    public void initialize(){
        bookId.setText(knjiga);
        memberId.setText(memberid);
    }

    public void backAction(ActionEvent actionEvent) {
    }
}
