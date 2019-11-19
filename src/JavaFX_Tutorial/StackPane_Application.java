package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPane_Application extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("My StackPane");
        stage.setHeight(500);
        stage.setWidth(500);

        ImageView image = new ImageView("https://www.idenyt.dk/globalassets/denmark/kaledyr-2/corgi/corgi_jumping.jpg");
        Label l1 = new Label("Hi");
        Button b2 = new Button("Hi, click me!");
        StackPane sPRoot = new StackPane(image, b2, l1); //Child nodes are stacked upon each other in a Stack Pane

        StackPane.setAlignment(b2, Pos.CENTER_LEFT); //Places the b2 node away so it's more visible

        Scene scene = new Scene(sPRoot);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

