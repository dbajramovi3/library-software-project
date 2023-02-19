package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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


    public void saveAction(ActionEvent actionEvent) throws LibraryException {

            String bookTitle = bookTitleId.getText().trim();
            String author = authorId.getText().trim();
            String currentBookHold = currentBookHoldId.getText().trim();

        if (bookTitle.isEmpty() || author.isEmpty() || currentBookHold.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Missing Information");
            alert.setContentText("Please enter book title, author, and current book hold.");
            alert.showAndWait();
            return;
        }
        if (!isString(bookTitle) || !isString(author)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong Information");
            alert.setContentText("Please enter valid book title and author (strings only).");
            alert.showAndWait();
            return;
        }
        if (!isInteger(currentBookHold) || Integer.parseInt(currentBookHold) <= 0 || Integer.parseInt(currentBookHold) > 100) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Number Error");
            alert.setContentText("Please enter a valid current book hold (integer between 1 and 100).");
            alert.showAndWait();
            return;
        }
        if (bookManager.getBookByTitle(bookTitle) != null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Book Already Exists");
            alert.setContentText("A book with the same title already exists.");
            alert.showAndWait();
            return;
        }

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


    public addBookController() {
    }

    public void cancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage) currentBookHoldId.getScene().getWindow();
        stage.close();
    }

}
