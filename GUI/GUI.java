package GUI;
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
import javafx.event.*;

public class GUI extends Application {
    @Override public void start(Stage stage)throws Exception{
         StackPane backgroundSettings = new StackPane();
         // load the image
         Image image = new Image("back2.jpg");
         Image title = new Image("mordekaiser2.png");
         //A button with the specified text caption.
         Button play = new Button("Play");
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
         // simple displays ImageView the image as is
         ImageView iv1 = new ImageView();
         iv1.setImage(image);
         ImageView iv2 = new ImageView();
         iv2.setImage(title);
         iv1.fitWidthProperty().bind(stage.widthProperty());
         iv2.fitWidthProperty().bind(stage.widthProperty());
         StackPane.setAlignment(iv2,Pos.TOP_CENTER);
         backgroundSettings.getChildren().addAll(iv1,iv2);
         Scene scene = new Scene(backgroundSettings);
         stage.setTitle("Game");
         stage.setScene(scene);
         stage.sizeToScene();
         stage.show();
     }
     public static void main(String[] args) {
         Application.launch(args);
     }
}
