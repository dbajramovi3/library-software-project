package ba.unsa.etf.rpr.controllers;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ba.unsa.etf.rpr.business.BookManager;
import ba.unsa.etf.rpr.business.MemberCardManager;
import ba.unsa.etf.rpr.business.MemberManager;
import ba.unsa.etf.rpr.business.ShoppingCartManager;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.domain.MemberCard;
import ba.unsa.etf.rpr.domain.ShoppingCart;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.event.ActionEvent;
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
    public Button shoppingCartInfoId;

    private BookManager bookManager = new BookManager();

    private MemberManager memberManager = new MemberManager();
    ShoppingCartManager shoppingCartManager = new ShoppingCartManager();

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

        if (bookName.isEmpty() && memberEmail.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error: You didn't enter a book name or member email!");
                alert.setHeaderText("Empty Fields");
                alert.setContentText("Please enter book name and member email.");
                alert.showAndWait();
                return;
            }

        List<Book> books =  bookManager.getByName(bookName);
        List<Member> members =  memberManager.getByEmail(memberEmail);


        if (books.size() == 0 || members.size() == 0) {
            // show an alert if either the book or member does not exist
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong information");
            alert.setResizable(false);
            alert.setContentText("Error: You didn't enter correct information!");
            alert.showAndWait();
        }
        else if (books.size()!=0 && members.size()!=0) {
            List<ShoppingCart> shoppingCartList = shoppingCartManager.getAll();
            boolean ima = false;
            List<Member> membersList = new ArrayList<>();
            membersList = memberManager.getByEmail(enterMemberEmailId.getText());
            Member member = new Member();
            if (membersList.size() == 1)
                member = membersList.get(0);

            List<Book> bookList = new ArrayList<>();
            bookList=bookManager.getByName(enterBookNameid.getText());
            Book book = new Book();
            if(bookList.size()==1)
                book = bookList.get(0);

            for(ShoppingCart sh :  shoppingCartList) {
                 int memberCardId = sh.getMember_card_id();
                 MemberCard memberCard = new MemberCard();
                 memberCard = DaoFactory.members_cardsDao().getById(memberCardId);

                if (memberCard.getMember_id() == member.getId()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Already registered book with this email");
                    alert.setResizable(false);
                    alert.setContentText("Error!");
                    alert.showAndWait();
                    ima = true;
                    break;
                }
            }
                if(ima==false){
                    ShoppingCart shoppingCart = new ShoppingCart();
                    shoppingCart.setBook_id(book.getId());
                    MemberCardManager memberCardManager = new MemberCardManager();
                    List<MemberCard> memberCardList = memberCardManager.getAll();
                    System.out.println("MEMBERCARDLIST: " + memberCardList.size());
                    MemberCard memberCard = new MemberCard();
                    for(MemberCard mc : memberCardList){
                        if(mc.getMember_id()==member.getId()){
                            memberCard=mc;
                            break;
                        }
                    }
                    System.out.println("MEMBER JE: " + member);
                    System.out.println("CARD: " + memberCard);
                    shoppingCart.setMember_card_id(memberCard.getId());
                    shoppingCart.setBuy_date(LocalDate.now());
                    shoppingCartManager.add(shoppingCart);
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


        }
    }catch(Exception e){

            System.out.println(e.getMessage());
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Error");
            alert.showAndWait();
        }
    }

    public void shoppingCartInfoAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/shoppingCart.fxml"));
        shoppingCartController controller = new shoppingCartController();
        loader.setController(controller);
        stage.setTitle("Shopping Cart");
        stage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        stage.setScene(new Scene(loader.<Parent>load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        stage.setResizable(false);
        stage.show();
    }
}
