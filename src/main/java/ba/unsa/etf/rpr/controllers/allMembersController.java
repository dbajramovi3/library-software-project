package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.List;

public class allMembersController {
    public Button closeId;
    public ListView listView;
    public TableView tableViewId;
    public TableColumn <Integer, Member> idId;
    public TableColumn <String, Member> nameId;
    public TableColumn <String, Member> last_nameId;
    public TableColumn <String, Member> emailId;
    private MemberManager memberManager = new MemberManager();

    /**
     * initialize method that loads member files as the window loads
     * @author dbajramovi3
     */

    @FXML
    public void initialize() throws LibraryException{

        idId.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameId.setCellValueFactory(new PropertyValueFactory<>("name"));
        last_nameId.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        emailId.setCellValueFactory(new PropertyValueFactory<>("email"));

        List<Member> memberList = memberManager.getAll();

        ObservableList<Member> observableList = FXCollections.observableList(memberList);
        tableViewId.setItems(observableList);

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
