package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class addBookController {
    public Button saveButtonId;
    public Button cancelButtonId;
    public TextField bookTitleId;
    public TextField bookId;
    public TextField authorId;
    public Label neispravanTextId;

    public void saveAction(ActionEvent actionEvent) throws IOException {
        /*
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addBook.fxml"));
        addBookController controller = new addBookController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
         */
    }

    public void cancelAction(ActionEvent actionEvent) {
    }

    public addBookController() {
    }

    //Napravit cemo da svaki id mora imati tacno 5 slova/karaktera/brojeva i to radimo pomocu initialize metode
    @FXML
    public void initialize(){
        bookId.textProperty().addListener((obs, newValue, oldValue) -> {
            if(newValue.length()==4)
                neispravanTextId.setText("");
            else
                neispravanTextId.setText("Id mora imati 5 karaktera!");
            });
        }

    }
