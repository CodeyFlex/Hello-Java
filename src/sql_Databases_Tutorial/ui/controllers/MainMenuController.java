package sql_Databases_Tutorial.ui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sql_Databases_Tutorial.com.entities.Person;

public class MainMenuController {
    @FXML
    Button updateButton = new Button();

    public void updateButtonAction(ActionEvent actionEvent) {

    }
    @FXML
    Button searchButton = new Button();
    @FXML
    TextField searchField = new TextField();

    public void searchButtonAction(ActionEvent actionEvent) {

    }

    @FXML
    Button addButton = new Button();

    public void addButtonAction(ActionEvent actionEvent) {

    }

    @FXML
    Button deleteButton = new Button();

    public void deleteButtonAction(ActionEvent actionEvent) {

    }

    @FXML
    TableView characterTable = new TableView();
    @FXML
    TableColumn<Person, Integer> idColumn;
    @FXML
    TableColumn<Person, String> nameColumn;
    @FXML
    TableColumn<Person, String> jobColumn;
    @FXML
    TableColumn<Person, String> raceColumn;
    @FXML
    TableColumn<Person, String> factionColumn;
}
