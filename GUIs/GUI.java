import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import java.util.EventListener;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;
import javafx.event.*;
import javafx.animation.Animation;
import javafx.geometry.Rectangle2D;
import javafx.util.Duration;

public class GUI extends Application {
    @Override public void start(Stage stage)throws Exception{
        StackPane backgroundSettings = new StackPane();

        // load the image
        Image image = new Image("back2.jpg");
        Image title = new Image("mordekaiser2.png");

        //A button with the specified text caption.
        Button play = new Button("Play");
        Button options = new Button("Options");
        DropShadow shadow = new DropShadow();

        //Adding the shadow when the mouse cursor is on
        play.addEventHandler(MouseEvent.MOUSE_ENTERED,
        new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            play.setEffect(shadow);
        }
        });

        //Removing the shadow when the mouse cursor is off
        play.addEventHandler(MouseEvent.MOUSE_EXITED,
        new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            play.setEffect(null);
        }
        });
        play.setStyle("-fx-font: 22 arial; -fx-base:   #b6e7c9;");

        //Adding the shadow when the mouse cursor is on
        options.addEventHandler(MouseEvent.MOUSE_ENTERED,
        new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            options.setEffect(shadow);
        }
        });

        //Removing the shadow when the mouse cursor is off
        options.addEventHandler(MouseEvent.MOUSE_EXITED,
        new EventHandler<MouseEvent>() {
        @Override public void handle(MouseEvent e) {
            options.setEffect(null);
        }
        });
        options.setStyle("-fx-font: 22 arial; -fx-base:   #b6e7c9;");


         // simple displays BACKGROUND IMAGEVIEW/BACKGROUND SCENE
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        ImageView iv2 = new ImageView();
        iv2.setImage(title);
        iv1.fitWidthProperty().bind(stage.widthProperty());
        iv2.fitWidthProperty().bind(stage.widthProperty());
        StackPane.setAlignment(iv2,Pos.TOP_CENTER);
        StackPane.setAlignment(play,Pos.CENTER);
        StackPane.setAlignment(options,Pos.BOTTOM_CENTER);
        backgroundSettings.getChildren().addAll(iv1,iv2,play,options);
        Scene scene = new Scene(backgroundSettings);
        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("Game");
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(800);
        stage.sizeToScene();
        stage.show();


        //CREATES the SELECTION Stage//
        play.setOnAction(e -> {selectionScene(stage);});
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

    //public void playSceneOne(Stage stage) {}

    public void selectionScene(Stage stage) {
        //Creates list of character selection//
        ListView<String> list = new ListView<String>();
        ObservableList<String> items =FXCollections.observableArrayList (
        "Warrior", "Thief", "Ninja", "Magical Girl" , "Mage" , "Dragon Tamer");
        list.setItems(items);

        //Creates Button//
        Button confirm = new Button("Confirm");
        //THIS FUNCTION SHOULD MOVE TO NEW SCREEN DEPENDING ON WHAT WAS CHOSEN
        //list.getSelectionModel().getSelectedItem(); (Gets the class you pick)
        //confirm.setOnAction(e -> {}) //Should return the right character

        //Edits stage and scene
        StackPane box = new StackPane();
        StackPane.setAlignment(confirm,Pos.BOTTOM_CENTER);
        box.getChildren().addAll(list,confirm);
        Scene select = new Scene(box);
        stage.setTitle("SELECT A CLASS");
        stage.setWidth(500);
        stage.setHeight(300);
        stage.setScene(select);
        stage.show();
    }
}
