package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class allMembersController {
    public Button closeId;
    public ListView listView;
    private MemberManager memberManager = new MemberManager();

    /**
     * initialize method that loads member files as the window loads
     * @author dbajramovi3
     */
    @FXML
    public void initialize(){
        try {
            listView.setItems(FXCollections.observableList(memberManager.getAll()));
        } catch (LibraryException e) {
            System.out.println("Exception in initialize method in allMembersController");
            throw new RuntimeException(e);
        }
    }

    /**
     * closes the stage
     * @param actionEvent
     */
    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) closeId.getScene().getWindow();
        stage.close();
    }
}
