package JavaFX_Tutorial;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

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
        mainStage.setHeight(800);

        VBox root = new VBox(); //Parent/root node, stands for vertical box as it displays labels vertically
        //I can also add stylesheets to my VBox
        //root.getStylesheets().add("path");
        //As long as the VBox has child nodes

        ToggleButton tButton1 = new ToggleButton("White"); //creates a new toggleable button
        tButton1.setOnAction(e -> {
            root.setStyle("-fx-background-color: #ffffff");
        });
        ToggleButton tButton2 = new ToggleButton("Green");
        tButton2.setOnAction(e -> {
            root.setStyle("-fx-background-color: #10ff00");
        });
        ToggleGroup buttonGroup = new ToggleGroup(); //The group makes it so that only one button can be toggled at a time
        tButton1.setToggleGroup(buttonGroup); //Adds button to the toggle group
        tButton2.setToggleGroup(buttonGroup);

        RadioButton radioB1 = new RadioButton("Pink");
        radioB1.setOnAction(e -> {
            root.setStyle("-fx-background-color: #ff5af5");
        });
        RadioButton radioB2 = new RadioButton("Black");
        radioB2.setOnAction(e -> {
            root.setStyle("-fx-background-color: #000000");
        });
        radioB1.setToggleGroup(buttonGroup);
        radioB2.setToggleGroup(buttonGroup);

        Label corgiAction = new Label("*Awaiting action*");

        MenuItem item1 = new MenuItem("Bark"); //Adds a menu button to my application
        item1.setOnAction(e -> {
            corgiAction.setText("Bark!");
        });

        MenuItem item2 = new MenuItem("Fart");
        item2.setOnAction(e -> {
            corgiAction.setText("*Neighbours house explodes*");
        });

        MenuItem item3 = new MenuItem("Sit");
        item3.setOnAction(e -> {
            corgiAction.setText("*Innocent worker ant crushed by corgi butt*");
        });

        MenuItem item4 = new MenuItem("Sleep");
        item4.setOnAction(e -> {
            corgiAction.setText("zzzZZZzzzzZZZzzz");
        });

        MenuButton menuButton = new MenuButton("Prefered action", null, item1, item2, item3, item4);

        Button button1 = new Button("Click Me"); //Creating a new button for my GUI
        button1.setStyle("-fx-font-size: 15px"); //Changing font size of button
        button1.setText("_Maybe click me?"); //changing text inside button (_ for mnemonic)
        button1.setWrapText(true); //Makes text visible even if it doesn't fit in the box

        button1.setMinSize(50,50); //Button can never go lower than this size
        button1.setPrefSize(100,50); //App will try to size the button by this value, but if it can't it will go to min/max size
        button1.setMaxSize(150,150); //Button can never go higher than this size

        //Mnemonic: shortcut for buttons (hold alt + first letter of shortcut to get a certain shortcut, alt + f to get file for example)
        button1.setMnemonicParsing(true); //Put _ in front of word, to make it the mnemonic shortcut letter

        button1.setOnAction(e -> { //Action that occurs after clicking button
            System.out.println("Clicked maybe button");
        });

        ImageView image1 = new ImageView("https://www.idenyt.dk/globalassets/denmark/kaledyr-2/corgi/corgi_jumping.jpg"); //Inserts image into scene from a url
        root.getChildren().add(image1);

        Label label1 = new Label("I'm a Corgi!"); //child node to parent node
        label1.setTextFill(Color.web("#34eb3a")); //Changes color of label
        label1.setFont(new Font("Times New Roman", 51)); //Changes the font of the label, and the number changes the size (pixel amount)

        Label label2 = new Label("Where am i going?"); //Label adds text to the stage/scene
        label2.setRotate(22); //Rotates the label

        Label label3 = new Label("I am uniqueee");
        label3.setId("unique-label"); //unique id so i can call this in my stylesheets

        root.getChildren().add(label1);
        root.getChildren().add(label2); //Adds the label to the parent node (VBox), can also do .addAll(label1, label2); so on.
        root.getChildren().add(label3);
        root.getChildren().add(button1);
        root.getChildren().add(menuButton);
        root.getChildren().add(corgiAction);
        root.getChildren().addAll(tButton1, tButton2, radioB1, radioB2);

        Hyperlink link = new Hyperlink("Button that prints"); //Creates a hyperlink
        link.setStyle("-fx-background-color: #ffc67b"); //setStyle directly to this particular hyperlink
        root.getChildren().add(link); //gets the hyperlink
        link.setOnAction(e -> { //link name: "link" referenced at start, and now i will decide the action when the link is clicked on
            System.out.println("Button was pressed"); //Action when link is clicked on
        });
        //Alternative way of doing it:
        //link.setOnAction(new EventHandler<ActionEvent>() {
        //    @Override
       //     public void handle(ActionEvent actionEvent) {
       //         System.out.println("Button was pressed v2");
       //     }
       // });

        Scene scene1 = new Scene(root); //My scene that everything will go under
        scene1.getStylesheets().add("JavaFX_Tutorial/stylesheets/styles.css"); //Gets styles from my css file. (this apparently doesn't work if i name my VBox parent?)
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
        captorWindow.toFront(); //Puts this window in front of the others.
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