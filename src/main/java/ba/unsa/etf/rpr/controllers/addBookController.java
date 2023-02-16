package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Dino Bajramovic
 */

public class addBookController {
    public Button saveButtonId;
    public Button cancelButtonId;
    public TextField bookTitleId;
    public TextField currentBookHoldId;
    public TextField authorId;
    private BookManager bookManager = new BookManager();

    public addBookController() {
    }
    public void saveAction(ActionEvent actionEvent){
        Book book = new Book();
        book.setTitle(bookTitleId.getText());
        book.setAuthor(authorId.getText());
        book.setCurrent_book_hold(Integer.parseInt(currentBookHoldId.getText()));
        try {
            bookManager.add(book);
        } catch (LibraryException e) {
            System.out.println("Exception in saveAction method in addBookController");
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) currentBookHoldId.getScene().getWindow();
        stage.close();
    }

    public void cancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage) currentBookHoldId.getScene().getWindow();
        stage.close();
    }

}
