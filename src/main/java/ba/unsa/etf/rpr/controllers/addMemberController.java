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
    private MemberManager memberManager = new MemberManager();

    public void saveAction(ActionEvent actionEvent) {
     Member member = new Member();
     member.setName(nameId.getText());
     member.setLast_name(lastNameId.getText());
     member.setEmail(emailId.getText());
     try{
         memberManager.add(member);
     } catch (LibraryException e) {
         System.out.println("Exception in saveAction method in addMemberController");
         throw new RuntimeException(e);
     }
        Stage stage = (Stage) emailId.getScene().getWindow();
        stage.close();
    }

    public void cancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage) emailId.getScene().getWindow();
        stage.close();
    }

}
