package ba.unsa.etf.rpr.controllers;
import java.util.List;
import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class SampleController {

    public Button addBookButtonid;
    public Button addMemberButtonid;
    public TextField enterMemberEmailId;
    public TextField enterBookNameid;
    public Button registerBookid;
    public Button allMembersid;
    public Button allBooksid;
    public Button searchMemberid;
    public Button searchBookButtonid;

    private BookManager bookManager = new BookManager();

    private MemberManager memberManager = new MemberManager();

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
        stage.setTitle("Add Book");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

      //SetOnHiding metoda koja ce mi potencijalno trebati poslije
        /*
        stage.setOnHiding(x->{
            List<String> lista = controller.vratiPodatke();
            listView.setItems(FXCollections.observableList(lista));
        });
    U slucaju ako bude trebala setonhiding metoda ako neces da se preklapaju podaci ovako ces napravit:
     stage.setOnHiding(x->{
            List<String> lista = controller.vratiPodatke();
            listView.getItems().addAll(FXCollections.observableList(lista));
        });
    */

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
        stage.setTitle("Add Member");
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
        stage.setTitle("Search Book");
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
        stage.setTitle("Search Member");
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
        stage.setTitle("All Books");
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
        stage.setTitle("All Members");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

    public void registerBookAction(ActionEvent actionEvent) throws IOException, LibraryException {
        try{
            String bookName = enterBookNameid.getText().trim();
        String memberEmail = enterMemberEmailId.getText().trim();

       // check if the book and member exist in the database
        List<Book> books =  bookManager.getByName(bookName);
        List<Member> members =  memberManager.getByEmail(memberEmail);
        if (books == null || members == null || books.size() == 0 || members.size() == 0) {
            // show an alert if either the book or member does not exist
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error: this book or email is not existing");
            alert.showAndWait();
        }else {
            bookManager.decreaseBookCount(books.get(0));
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/registerBook.fxml"));
            registerBookController controller = new registerBookController(enterBookNameid.getText(), enterMemberEmailId.getText());
            loader.setController(controller);
            stage.setTitle("Register Book");
            stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
            stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
            stage.setResizable(false);
            stage.show();
        }
    }catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Knjiga ne postoji");
            alert.showAndWait();
        }
    }

    public void okAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/buy.fxml"));
        buyController controller = new buyController();
        loader.setController(controller);
        stage.setTitle("Table");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }

    public SampleController(){
    }

    @FXML
    public void initialize(){

    }

}
