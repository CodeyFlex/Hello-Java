package sql_Databases_Tutorial.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sql_Databases_Tutorial.com.daoImplementation.PersonDaoImpl;

public class Main extends Application {

    //Starting the application
    @Override
    public void init() throws Exception {
        System.out.println("Application initializing!");
        PersonDaoImpl createPersonTableCall = new PersonDaoImpl();
        createPersonTableCall.createPersonTable();
    }
    //Opening the main window of the application
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/MainMenu.fxml"));
        primaryStage.setTitle("My SQL UI");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    //Launch arguments
    public static void main(String[] args) {
        launch(args);
    }
}
