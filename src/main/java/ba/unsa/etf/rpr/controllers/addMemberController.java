package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.MemberCardManager;
import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.domain.MemberCard;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class addMemberController {
    public Button saveButtonId;
    public Button cancelButtonId;
    public TextField nameId;
    public TextField lastNameId;
    public TextField emailId;
    private MemberManager memberManager = new MemberManager();
    private MemberCardManager memberCardManager = new MemberCardManager();

    /**
     * Just like in addBookController simple checkings if user enters information we do not want
     * shows an alert
     * @author dbajramovi3
     */

    public void saveAction(ActionEvent actionEvent) throws LibraryException {

        String name = nameId.getText();
        String lastName = lastNameId.getText();
        String email = emailId.getText();

        if (name.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
            // Show an alert if any fields are empty
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("One or more fields are empty");
            alert.setContentText("Please enter values for all fields");
            alert.showAndWait();
            return;
        }
        if (!isString(name) || !isString(lastName)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong Information");
            alert.setContentText("Please enter valid member name and member last name (strings only).");
            alert.showAndWait();
            return;
        }
        /**
         * Checking if there already is an existing member, and we check via email
         * If there are no existing members with the same email address, the code creates a new Member
         * object and sets its name, last name, and email fields based on the values entered by the user in the GUI.Finally, the code creates a new MemberCard object, sets its activation date
         * and member ID fields, and calls the add method of the memberCardManager object to add the new member card to the system.
         * @author dbajramovi3
         */
        List<Member> existingMembers = memberManager.getByEmail(email);
        if (!existingMembers.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Email already exists");
            alert.setContentText("This email address is already associated with a member. Please enter a different email address.");
            alert.showAndWait();
            return;
        }

        Member member = new Member();
     member.setName(nameId.getText());
     member.setLast_name(lastNameId.getText());
     member.setEmail(emailId.getText());
     try{
         memberManager.add(member);
         MemberCard memberCard = new MemberCard();
         memberCard.setActivation_date(LocalDate.now());
         LocalDate date = LocalDate.now();
         memberCard.setMember_id(member.getId());
         memberCardManager.add(memberCard);
     } catch (LibraryException e) {
         System.out.println("Exception in saveAction method in addMemberController");
         throw new RuntimeException(e);
     }
        Stage stage = (Stage) emailId.getScene().getWindow();
        stage.close();
    }

    /**
     * Same as in addBookController
     * @param str
     * @return
     */
    private boolean isString(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        String trimmedStr = str.trim().replaceAll("\\s+", "");
        return trimmedStr.matches("[a-zA-Z]+");
    }

    private boolean isInteger(String str) {
        return str.matches("\\d+");
    }


    public void cancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage) emailId.getScene().getWindow();
        stage.close();
    }

}
