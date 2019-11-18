package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBox_Application extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My HBox");

        HBox hRoot = new HBox(); //In the HBox, every button is laid out horizontally instead of vertically like in the VBox.

        Button b1 = new Button ("Button One");
        Button b2 = new Button ("Button Two");
        Button b3 = new Button ("Button Three");
        Button b4 = new Button ("Runaway Button");

        hRoot.setSpacing(12); //Sets the space between each button in the HBox
        //hRoot.setAlignment(Pos.BASELINE_CENTER); //Aligns the buttons on the selected position, no matter the window size/stretch
        //hRoot.setPadding(new Insets(15,15,15,15)); //Clockwise values, so first value is top, then right, down, and left. setPadding sets the space around each button in the HBox
        hRoot.setMargin(b4, new Insets(70,50,70,250)); //Sets space margins for this particular button

        hRoot.getChildren().addAll(b1, b2, b3, b4);
        Scene scene = new Scene(hRoot);
        stage.setScene(scene);
        stage.show();
    }
}
