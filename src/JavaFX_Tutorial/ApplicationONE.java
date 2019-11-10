package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ApplicationONE extends Application {

    //optional - method runs before start method is called
    @Override
    public void init() throws Exception { //init, Useful for loading pictures and such, before the application launches.
        System.out.println("Application started"); //prints before application is started
    }

    //the start method is abstract and MUST be overided when making a new javafx app
    @Override
    public void start(Stage mainStage) throws Exception { //Stage is a window in the GUI

        mainStage.setTitle("Flexy Application");
        mainStage.setWidth(600);
        mainStage.setHeight(600);
        mainStage.toFront(); //Puts this window in front of the others.

        VBox parent = new VBox(); //Parent/root node, stands for vertical box as it displays labels vertically

        ImageView image1 = new ImageView("https://www.idenyt.dk/globalassets/denmark/kaledyr-2/corgi/corgi_jumping.jpg"); //Inserts image into scene from a url
        parent.getChildren().add(image1);

        Label label1 = new Label("I'm a Corgi!"); //child node to parent node
        label1.setTextFill(Color.web("#34eb3a")); //Changes color of label
        label1.setFont(new Font("Times New Roman", 51)); //Changes the font of the label, and the number changes the size (pixel amount)
        Label label2 = new Label("Where am i going?"); //Label adds text to the stage/scene
        label2.setRotate(22); //Rotates the label
        parent.getChildren().add(label1);
        parent.getChildren().add(label2); //Adds the label to the parent node (VBox), can also do .addAll(label1, label2); so on.

        Scene scene1 = new Scene(parent); //My scene that everything will go under
        scene1.setCursor(Cursor.CROSSHAIR); //Changes cursor to a crosshair when using the scene

        mainStage.setScene(scene1);

        mainStage.show();

        Stage prisonerStage1 = new Stage();
        prisonerStage1.setTitle("Prisoner 1"); //Giving my stage a name
        prisonerStage1.setWidth(300); //Setting width of stage
        prisonerStage1.setHeight(200); //Setting height of stage
        prisonerStage1.setX(500); //Setting launch location horizontally
        prisonerStage1.setY(200);//Setting launch location vertically
        prisonerStage1.toBack(); //Puts this window behind the others.
        prisonerStage1.show(); //Show the stage

        Stage prisonerStage2 = new Stage(); //Second stage creation
        prisonerStage2.setTitle("Prisoner 2");
        prisonerStage2.setWidth(300);
        prisonerStage2.setHeight(200);
        prisonerStage2.setX(100);
        prisonerStage2.setY(200);
        prisonerStage2.initModality(Modality.WINDOW_MODAL); //Disallows interaction with the window that owns this window until it's closed.
        prisonerStage2.initOwner(prisonerStage1); //Makes prisonerStage1 the owner of prisonerStage2, and therefore prisonerStage1 cannot be closed until prisonerStage2 has been closed.
        prisonerStage2.toBack();
        prisonerStage2.show();

        //Modality

        Stage captorWindow = new Stage();
        captorWindow.setWidth(300);
        captorWindow.setHeight(200);
        captorWindow.setTitle("I am the captor of all these windows, mwahaha!");
        // delete later. captorWindow.toFront(); //Puts this window in front of the others.
        //There's also .setAlwaysOnTop(true); and .setFullScreen(true);
        captorWindow.initModality(Modality.APPLICATION_MODAL); //Other windows can't be used until this one is closed, like if you go to settings in most applications
        //(Modality.NONE); is the default value, and allows for interaction with any window
        captorWindow.initStyle(StageStyle.DECORATED); //StageStyle. to select a stage style for the specific window

        captorWindow.show();

        //Stage styles:
        //1. Decorated: standard with the 3 buttons, minimize, enlarge and exit.
        //2. Transparent: invisible window
        //3. Utility: Maybe a settings window, has a little exit button.
        //4. Undecorated: only shows the content of the window, no frame.
        //5. Unified: removes the borders
    }

    //optional - method runs when application stops
    @Override
    public void stop() throws Exception { //stop, method that i run after the application is stopped.
        System.out.println("Application ended"); //Will be printed after application is stopped
    }
}
