package FreeForm_Learning.Text_Adventure;

import FreeForm_Learning.Text_Adventure.Characters.*;
import FreeForm_Learning.Text_Adventure.Characters.Character;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Text_Adventure_Class extends Application {

    //Starting the application
    @Override
    public void init() throws Exception {
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
        HBox dialogInfo = new HBox();

        //Character Imports
        Character goblin = new Goblin();

        //My Imports

        Label replyLabel = new Label(goblin.Greeting());
        Label conversationPartner = new Label(goblin.getName());
        //label3.setId("unique-label"); //unique id so i can call this in my stylesheets
        Button reply1 = new Button("Hi there!");
        Button reply2 = new Button("Why are you talking to me?");// add colors depending on the answers tone

        //My on actions

        //Reply 1.1
        reply1.setOnAction(f -> {
            replyLabel.setText("Nice to finally meet you! have you met the others yet?");
            reply1.setText("Not yet, no");
            reply2.setText("Don't want to");

            //Reply 1.2
            reply1.setOnAction(f2 -> {
                replyLabel.setText("Well let's go and i'll introduce you!");
                reply1.setText("Alright!");
                reply2.setText("Too scary");
            });
            reply2.setOnAction(f2 -> {
                replyLabel.setText("Why not?");
                reply1.setText("I'm really into peanuts");
                reply2.setText("I'm afraid i'll eat their peanuts");
            });
        });

        //Reply 2.1
        reply2.setOnAction(e -> {
            replyLabel.setText("Rude!");
            reply1.setText("I'm sorry");
            reply2.setText("No u");

            //Reply 2.2
            reply1.setOnAction(e2 -> {
                replyLabel.setText("I can tell you're nervous, so i'll let it slide this time");
                reply1.setText("Thanks for your understanding");
                reply2.setText("No u");
            });
            reply2.setOnAction(e2 -> {
                replyLabel.setText("How was i rude?!");
                reply1.setText("Well... i dunno, i'm just nervous");
                reply2.setText("You know what you did");
            });
        });

        //Importing my imports
        text_Adventure_Main_BorderPane.setTop(dialogInfo);
        text_Adventure_Main_BorderPane.setCenter(replyLabel);
        //text_Adventure_Main_BorderPane.setRight(name);
        //text_Adventure_Main_BorderPane.setLeft(name);
        text_Adventure_Main_BorderPane.setBottom(buttons);

        //HBox buttons
        buttons.getChildren().addAll(reply1, reply2);

        //HBox dialogInfo
        dialogInfo.getChildren().addAll(conversationPartner);

        //Positioning
        //BorderPane.setAlignment(, Pos.TOP_CENTER); //Location
        BorderPane.setAlignment(replyLabel, Pos.CENTER);
        //BorderPane.setAlignment(name, Pos.CENTER_RIGHT); //Picture of dialog partner
        //BorderPane.setAlignment(name, Pos.CENTER_LEFT); //Picture of player
        BorderPane.setAlignment(buttons, Pos.BOTTOM_CENTER); //HBox

        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(20);

        dialogInfo.setSpacing(30);
        dialogInfo.setStyle("-fx-font-size: 15px");

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