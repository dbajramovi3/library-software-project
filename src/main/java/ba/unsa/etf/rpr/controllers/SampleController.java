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
    public Button addMemberButtonid;

    /* Napravili smo akciju za addBookAction s tim da smo je povezali tako da ne moramo povezivat putme addBook.fxml u tekst kodu
    Ovo je prva akcija koju smo napravili i nije nam trebao listener jer nismo unosili podatke iz razloga sto app ne zahtjeva log in formu
    listener uvijek pozivas nad propertijem, tacnije textProperty.getListener() jer su stringovi u pitanju
    znaci uvezali smo 2 prozora ali ne kroz fxml kod nego kroz java kod

   OVAJ kod u addBookAction smo mogli napisati kao kod u AppFX jer ne saljes nikakve parametre
   Ali napisao sam ga cisto iz razloga jer sam pratio tutorijal 8, znaci kad saljemo parametre pisemo ovaj kod ispod s tim da:
      addBookController controller = new addBookController(); napises kao
         addBookController controller = new addBookController(imeId.getText(), prezimeId.getText()); jer saljemo 2 parametra
         String ime i prezime
     */


    public void addBookActon(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addBook.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/addBook.fxml"));
        addBookController controller = new addBookController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }
/*
Ove akcija ne mozemo pisati kao AppFX iz razloga sto moramo izbrisati text iz Sample controllera. tj. fx:controller="ba.unsa.etf.rpr.controllers..."
Da smo to uraditi prozor se ne bi otvorio i prikazivalo bi error
Ovako je to moguce
 */
    public void addMemberAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/addMember.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/addBook.fxml"));
        addMemberController controller = new addMemberController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

    public void searchBookAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/searchBook.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/addBook.fxml"));
        searchBookController controller = new searchBookController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

    public void searchMemberAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/searchMember.fxml"));
        searchMemberController controller = new searchMemberController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

    public void allBooksAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/allBooks.fxml"));
        allBooksController controller = new allBooksController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();

    }

    public void allMembersAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/allMembers.fxml"));
        allMembersController controller = new allMembersController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

    public void registerBookAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/registerBook.fxml"));
        registerBookController controller = new registerBookController();
        loader.setController(controller);
        stage.setTitle("Aplikacija");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }



    public SampleController(){
    }

    //Ovdje dodajemo listener koji uvijek ide uz property
    // imeId.textProperty().addListener((obs, oldValue, newValue) ->{ sout...});
    //obs je observer
    @FXML
    public void initialize(){

    }

}
