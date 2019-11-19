package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane_Application extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("My GridPane");

        Label usernameLabel = new Label("Username");
        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");
        Label loggingInLabel = new Label("Waiting for login");

        TextField usernameField = new TextField(); //Text field that allows user to input information
        TextField emailField = new TextField();
        PasswordField passwordField = new PasswordField(); //A different text field that hides the input

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            loggingInLabel.setText("Logging in!");
        });

        GridPane gPRoot = new GridPane(); //Grid panes are good for forms, like login pages and such.

        gPRoot.add(usernameLabel, 0, 0); //first value is the label i'll add, second value is an int for the column, third is the int for the row.
        //Columns will be placed vertically, and rows horizontally.
        gPRoot.add(emailLabel, 0, 1);
        gPRoot.add(passwordLabel, 0, 2);

        gPRoot.add(usernameField, 1, 0); //Add's text field to my application on the next column, so that it's next to my labels
        gPRoot.add(emailField, 1, 1);
        gPRoot.add(passwordField, 1, 2);

        gPRoot.add(loginButton, 1, 3);
        gPRoot.add(loggingInLabel,1,4);

        gPRoot.setVgap(10); //Set's the spacing between each node vertically
        gPRoot.setHgap(10); //Set's the spacing between each node horizontally
        gPRoot.setPadding(new Insets(45));

        Scene scene = new Scene(gPRoot);
        stage.setScene(scene);
        stage.show();
    }
}

