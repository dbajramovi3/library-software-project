package ba.unsa.etf.rpr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;


public class AppFX extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Aplikacija");
        primaryStage.getIcons().add(new Image("https://icons-for-free.com/iconfiles/png/512/bookshelf+library+icon-1320087270870761354.png"));
        primaryStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
      //  Image img = new Image("https://i.pinimg.com/originals/8c/74/bb/8c74bb4e959d7211e27c10b5980cb970.jpg");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
