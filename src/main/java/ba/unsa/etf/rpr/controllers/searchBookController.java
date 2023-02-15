package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class searchBookController {


    public TextField enterBookNameId;
    public Label labelId;
    public Button closeButtonId;

    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) labelId.getScene().getWindow();
        stage.close();
    }
}
