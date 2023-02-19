package ba.unsa.etf.rpr.controllers;

import ba.unsa.etf.rpr.business.ShoppingCartManager;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.domain.MemberCard;
import ba.unsa.etf.rpr.domain.ShoppingCart;
import ba.unsa.etf.rpr.exception.LibraryException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.List;

public class shoppingCartController {
    public Button deleteBttnId;
    public TableView<ShoppingCart> tableView;
    public TableColumn<Integer, ShoppingCart> idColumn;
    public TableColumn<LocalDate, ShoppingCart> buyDateColumn;
    public TableColumn<MemberCard, ShoppingCart> memberCardIdColumn;
    public TableColumn<Book, ShoppingCart> bookIdColumn;
    ShoppingCartManager shoppingCartManager = new ShoppingCartManager();
    public void deleteAction(ActionEvent actionEvent) throws LibraryException {

        ShoppingCart selectedItem = (ShoppingCart) tableView.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            // Remove the selected item from the table view
            tableView.getItems().remove(selectedItem);

            // Delete the selected item from the database
            shoppingCartManager.delete(selectedItem.getId());
        }

    }

    public void initialize() throws LibraryException {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        memberCardIdColumn.setCellValueFactory(new PropertyValueFactory<>("member_card_id"));
        bookIdColumn.setCellValueFactory(new PropertyValueFactory<>("book_id"));
        buyDateColumn.setCellValueFactory(new PropertyValueFactory<>("buy_date"));
        List<ShoppingCart> shoppingCartList = shoppingCartManager.getAll();
        ObservableList<ShoppingCart> observableList = FXCollections.observableList(shoppingCartList);
        tableView.setItems(observableList);
    }

}
