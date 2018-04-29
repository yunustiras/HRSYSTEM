package hrsystem.modules.project.controller;

import hrsystem.util.StageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProjectsView implements Initializable {

    private static String PreviousSceneFxmlPath = "/hrsystem/main/fxml/main.fxml";

    @FXML
    private Button returnMain;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchText;

    @FXML
    public void handleButtonAction(ActionEvent event){
        Stage stage = (Stage) returnMain.getScene().getWindow();
        if (event.getSource() == returnMain) {
            System.out.println("returnMain clicked.");
            try {
                StageController.switchStage(stage, PreviousSceneFxmlPath);
            } catch (IOException e) {
                System.out.println("Fxml doesn't exists or " + e.toString());
            } catch (Exception e) {
                System.out.println("Wtf " + e.toString());
            }
        } else if (event.getSource() == searchButton) {
            System.out.println(String.format("Will Search Project at %s",searchText.getText()));
        } else {
            System.out.println("What?");
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ProjectsView is now loaded!");
    }
}
