package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.business.MemberManager;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class searchMemberController {
    public TextField enterMemberNameId;
    public Label labelId;
    public Button closeButtonId;
    private MemberManager memberManager = new MemberManager();
    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) labelId.getScene().getWindow();
        stage.close();
    }
}
