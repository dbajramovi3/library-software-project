package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class SampleController {

    public Button addBookButtonid;

    public void addBookActon(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/addBook.fxml"));
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }
     public SampleController(){
     }

     @FXML
    public void initialize(){

     }
}
