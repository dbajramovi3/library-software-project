package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.List;

public class searchBookController {


    public TextField enterBookNameId;
    public Label labelId;
    public Button closeButtonId;
    public Button searchBttn;

    private BookManager bookManager = new BookManager();
    public void closeAction(ActionEvent actionEvent) {
        Stage stage = (Stage) labelId.getScene().getWindow();
        stage.close();
    }

    public void searchBttnAction(ActionEvent actionEvent) {
        try {
            List<Book> bookList = bookManager.getByName(enterBookNameId.getText());
            if(bookList.size()!=0) labelId.setText("Book is in the database");
            else labelId.setText("Book is not in the database");
        } catch (LibraryException e) {
            System.out.println("EXCEPTION");
            throw new RuntimeException(e);
        }

    }
}
