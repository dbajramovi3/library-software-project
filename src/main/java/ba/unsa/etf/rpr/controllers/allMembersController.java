package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class allMembersController {
    public Button closeId;
    public ListView listView;

    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) closeId.getScene().getWindow();
        stage.close();
    }
}
