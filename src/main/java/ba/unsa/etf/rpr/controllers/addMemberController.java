package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addMemberController {
    public Button saveButtonId;
    public Button cancelButtonId;
    public TextField nameId;
    public TextField lastNameId;
    public TextField emailId;
    public TextField memberId;
    public Label neispravanTextId;
    private MemberManager memberManager = new MemberManager();

    public void saveAction(ActionEvent actionEvent) {
     Member member = new Member();
     member.setId(Integer.parseInt(memberId.getText()));
     member.setEmail(emailId.getText());
     member.setName(nameId.getText());
     member.setLast_name(lastNameId.getText());
     try{
         memberManager.add(member);
     } catch (LibraryException e) {
         System.out.println("Exception in saveAction method in addBookController");
         throw new RuntimeException(e);
     }
        Stage stage = (Stage) memberId.getScene().getWindow();
        stage.close();
    }

    public void cancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage) memberId.getScene().getWindow();
        stage.close();
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
