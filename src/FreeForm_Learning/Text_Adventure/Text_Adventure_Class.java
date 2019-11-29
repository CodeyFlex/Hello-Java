package FreeForm_Learning.Text_Adventure;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Text_Adventure_Class extends Application {

    //Starting the application
    @Override
    public void init() throws Exception { //init, Useful for loading pictures and such, before the application launches.
        System.out.println("Let the adventure begin!");
    }

    //My Application
    @Override
    public void start(Stage mainStage) throws Exception { //Stage is a window in the GUI

        //Stage setup
        mainStage.setTitle("Text Adventure Name");
        mainStage.setWidth(600);
        mainStage.setHeight(300);

        //Box setups
        BorderPane text_Adventure_Main_BorderPane = new BorderPane();
        HBox buttons = new HBox();

        //My Imports

        Label infoLabel = new Label("Welcome!");
        Label replyLabel = new Label("Hello traveler!");
        //label3.setId("unique-label"); //unique id so i can call this in my stylesheets
        Button reply1 = new Button("Hi there!");
        Button reply2 = new Button("Why are you talking to me?");// add colors depending on the answers tone

        //My on actions
        reply1.setOnAction(e -> {
            replyLabel.setText("Nice to finally meet you! have you met the others yet?");
        });
        reply2.setOnAction(e -> {
            replyLabel.setText("Rude!");
        });

        //Importing my imports
        text_Adventure_Main_BorderPane.setTop(infoLabel);
        text_Adventure_Main_BorderPane.setCenter(replyLabel);
        //text_Adventure_Main_BorderPane.setRight(name);
        //text_Adventure_Main_BorderPane.setLeft(name);
        text_Adventure_Main_BorderPane.setBottom(buttons);

            //HBox
            buttons.getChildren().addAll(reply1, reply2);

        //Positioning
        BorderPane.setAlignment(infoLabel, Pos.TOP_CENTER);
        BorderPane.setAlignment(replyLabel, Pos.CENTER);
        //BorderPane.setAlignment(name, Pos.CENTER_RIGHT);
        //BorderPane.setAlignment(name, Pos.CENTER_LEFT);
        BorderPane.setAlignment(buttons, Pos.BOTTOM_CENTER); //HBox

        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(20);

        text_Adventure_Main_BorderPane.setPadding(new Insets(45));


        //Scene setup
        Scene mainScene = new Scene(text_Adventure_Main_BorderPane); //My scene that everything will go under
        mainScene.getStylesheets().add("FreeForm_Learning/Text_Adventure/Stylesheets/Styles.css"); //Gets styles from my css file. (this apparently doesn't work if i name my VBox parent?)

        mainStage.setScene(mainScene);

        mainStage.show();

    }

    //Ending the application
    @Override
    public void stop() throws Exception {
        System.out.println("Thanks for playing!");
    }
}