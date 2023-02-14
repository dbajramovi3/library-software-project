package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class addMemberController {
    public Button saveButtonId;
    public Button cancelButtonId;
    public TextField nameId;
    public TextField lastNameId;
    public TextField emailId;
    public TextField memberId;
    public Label NeispravanTextId;

    public void saveAction(ActionEvent actionEvent) {
    }

    public void cancelAction(ActionEvent actionEvent) {
    }

    public addMemberController() {

    }

    @FXML
    public void Initialize(){
        memberId.textProperty().addListener((obs, newValue, oldValue) -> {
            if(newValue.length()==4){
                NeispravanTextId.setText("");
            }
            else NeispravanTextId.setText("Id mora imati 5 karaktera!");
        });

    }
}
