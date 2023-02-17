package ba.unsa.etf.rpr.controllers;


import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.List;

public class searchMemberController {
    public TextField enterMemberNameId;
    public Label labelId;
    public Button closeButtonId;
    public Button searchBttn;
    public TextField enterMNameId;
    private MemberManager memberManager = new MemberManager();
    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) labelId.getScene().getWindow();
        stage.close();
    }

    public void searchBttnAction(ActionEvent actionEvent) {
        try {
            List<Member> memberList = memberManager.getByName(enterMNameId.getText());
            if(memberList.size()!=0) labelId.setText("Member is in the database");
            else labelId.setText("Member is not in the database");
        } catch (LibraryException e) {
            System.out.println("EXCEPTION");
            throw new RuntimeException(e);
        }

    }
}
