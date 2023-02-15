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
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class addBookController {
    public Button saveButtonId;
    public Button cancelButtonId;
    public TextField bookTitleId;
    public TextField bookId;
    public TextField authorId;
    public Label neispravanTextId;

    /*
        Stage stage = (Stage) bookId.getScene().getWindow();
        stage.close();
        Ovako izgleda zatvaranje nekog prozora
     */
    public void saveAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) bookId.getScene().getWindow();
        stage.close();
    }

    public void cancelAction(ActionEvent actionEvent) {
        Stage stage = (Stage) bookId.getScene().getWindow();
        stage.close();
    }
//Kada zelimo da vratimo podatke sa pomocne metode na glavnu moramo napraviti pomocnu metodu
    //To upravo radimo i zelimo da nam vraca listu stringova
    public List<String> vratiPodatke(){
        return new ArrayList<>();
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
