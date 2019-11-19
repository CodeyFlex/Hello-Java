package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
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
        Label l2 = new Label("He's sitting on meee");
        Label l3 = new Label("No i'm not. <.<");
        StackPane sPRoot = new StackPane(image, b2, l1, l2, l3); //Child nodes are stacked upon each other in a Stack Pane

        StackPane.setAlignment(b2, Pos.CENTER_LEFT); //Places the b2 node away so it's more visible
        StackPane.setAlignment(l2, Pos.TOP_CENTER);
        StackPane.setAlignment(l3, Pos.TOP_CENTER);

        l2.setTextFill(Color.web("#34eb3a"));
        l3.setTextFill(Color.web("#ffc67b"));
        l2.setStyle("-fx-font-size: 25px");
        l3.setStyle("-fx-font-size: 35px");

        Scene scene = new Scene(sPRoot);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

