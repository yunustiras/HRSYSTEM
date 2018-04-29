package hrsystem.controllers;

import hrsystem.util.StageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Index implements Initializable {
    public static String AddProjectFxmlScenePath = "/hrsystem/fxml/addProject.fxml";
    public static String ListProjectFxmlScenePath = "/hrsystem/fxml/projects.fxml";
    public static String AddEmployeeFxmlScenePath = "/hrsystem/fxml/addEmployee.fxml";
    public static String ListEmployeeFxmlScenePath = "/hrsystem/fxml/employees.fxml";

    Stage stage;
    @FXML
    private Button addProjectButton;

    @FXML
    private Button listProjectButton;

    @FXML
    private Button addEmployeeButton;

    @FXML
    private Button listEmployeeButton;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        stage = (Stage) addProjectButton.getScene().getWindow();
        try {
            if (event.getSource() == addProjectButton) {
                System.out.println("addProjectButton clicked.");
                StageController.switchStage(stage, AddProjectFxmlScenePath);
            } else if(event.getSource() == listProjectButton) {
                System.out.println("listProjectButton clicked.");
                StageController.switchStage(stage, ListProjectFxmlScenePath);
            } else if(event.getSource() == addEmployeeButton) {
                System.out.println("addEmployeeButton clicked.");
                StageController.switchStage(stage, AddEmployeeFxmlScenePath);
            } else if(event.getSource() == listEmployeeButton) {
                System.out.println("listEmployeeButton clicked.");
                StageController.switchStage(stage, ListEmployeeFxmlScenePath);
            } else {
                System.out.println("nothing clicked.");
            }
        }
        catch (IOException e) {
            System.out.println("Fxml doesn't exists or " + e.toString());
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Index is now loaded!");
    }

}