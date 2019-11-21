package JavaFX_Tutorial.FXML_Application.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public Button loginButton = null; //Write this to work with the controls made in scene builder
    public Label waitForLogin = null; //Make sure it's public

    public void onAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Button was clicked");
        waitForLogin.setText("Logging in!");

        //Now let's change the scene to the menu
        Parent menuParent = FXMLLoader.load(getClass().getResource("../Resources/Menu.fxml")); //Creating new parent for my new scene, ../ means it's going back to earlier/parent package
        Scene menuScene = new Scene(menuParent); //Creating new scene for the menu

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow(); //To get the stage i'll ask for a Node type object, and because it's a node object, i can get the scene and the window.

        window.setScene(menuScene);
        window.show();
    }
}
