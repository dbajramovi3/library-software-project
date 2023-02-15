package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class allBooksController {
    public Button closeId;

    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) closeId.getScene().getWindow();
        stage.close();
    }
}
