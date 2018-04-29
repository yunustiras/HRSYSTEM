package hrsystem.controllers;

import hrsystem.util.StageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddEmployee implements Initializable {
    public static String PreviousSceneFxmlPath = "/hrsystem/fxml/employees.fxml";
    Stage stage;

    @FXML
    private TextField firstName, surname;

    @FXML
    public void handleButtonAction(ActionEvent event){
        stage = (Stage) firstName.getScene().getWindow();
        System.out.println(firstName.getText() + surname.getText());
        try {
            StageController.switchStage(stage, PreviousSceneFxmlPath);
        } catch (IOException e) {
            System.out.println("Fxml doesn't exists or " + e.toString());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("AddEmployee is now loaded!");
    }
}