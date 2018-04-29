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

public class AddProject implements Initializable {
    public static String PreviousSceneFxmlPath = "/hrsystem/fxml/projects.fxml";
    Stage stage;

    @FXML
    private TextField name, description;

    @FXML
    public void handleButtonAction(ActionEvent event){
        stage = (Stage) name.getScene().getWindow();
        System.out.println(name.getText() + description.getText());
        try {
            StageController.switchStage(stage, PreviousSceneFxmlPath);
        } catch (IOException e) {
            System.out.println("Fxml doesn't exists or " + e.toString());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("AddProject is now loaded!");
    }
}