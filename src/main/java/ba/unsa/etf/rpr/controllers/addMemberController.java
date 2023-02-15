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
    public Label neispravanTextId;

    public void saveAction(ActionEvent actionEvent) {
    }

    public void cancelAction(ActionEvent actionEvent) {
    }

    public addMemberController() {

    }
//initialize metoda prilikom unosa id za member, kao i sto je za book jer id MORA imati 5 karaktera

    @FXML
    public void initialize(){
        memberId.textProperty().addListener((obs, newValue, oldValue) -> {
            if(newValue.length()==4)
                neispravanTextId.setText("");
            else
                neispravanTextId.setText("Id mora imati 5 karaktera!");
        });
    }
}
