package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPane_Application extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("My BorderPane");
        stage.setWidth(500);
        stage.setHeight(500);

        BorderPane bRoot = new BorderPane();

        Button bCenter = new Button("Center");
        Button bTop = new Button("Top");
        Button b3 = new Button("Right");
        Button b4 = new Button("Left");
        Button b5 = new Button("Bottom");

        bRoot.setCenter(bCenter);
        bRoot.setTop(bTop);
        bRoot.setRight(b3);
        bRoot.setLeft(b4);
        bRoot.setBottom(b5);

        BorderPane.setAlignment(bCenter, Pos.CENTER);
        BorderPane.setAlignment(bTop, Pos.TOP_CENTER);
        BorderPane.setAlignment(b3, Pos.CENTER_RIGHT);
        BorderPane.setAlignment(b4, Pos.CENTER_LEFT);
        BorderPane.setAlignment(b5, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(bRoot);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
