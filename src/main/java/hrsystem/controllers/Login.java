package hrsystem.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import hrsystem.util.StageController;

public class Login implements Initializable {
    public static String FxmlScenePath = "/hrsystem/fxml/index.fxml";

    @FXML
    private TextField textUser;

    @FXML
    private PasswordField textPassword;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String user = textUser.getText();
        String password = textPassword.getText();
        System.out.println(String.format("User: %s, Password: %s", user, password));
        if(user.equals("admin") && password.equals("1234")) {
            Stage stage = (Stage) textUser.getScene().getWindow();
            try {
                StageController.switchStage(stage, FxmlScenePath);
            }
            catch (IOException e) {
                System.out.println("App.fxml doesn't exists." + e.toString());
            }
        }
        else{
            System.out.println("Try 'admin' and '1234' for login");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Login View is now loaded!");
    }
}