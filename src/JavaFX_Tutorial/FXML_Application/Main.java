package JavaFX_Tutorial.FXML_Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Resources/Login.fxml")); //Loads my fxml into my app
        Parent menuRoot = FXMLLoader.load(getClass().getResource("Resources/Menu.fxml"));
        Scene menu = new Scene(menuRoot);

        primaryStage.setTitle("My FXML Application");
        primaryStage.setScene(new Scene(menuRoot, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
