package hrsystem.modules.login.controller;

import hrsystem.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginView implements Initializable {
    @FXML
    private TextField textEmail;

    @FXML
    private PasswordField textPassword;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String email = textEmail.getText();
        String password = textPassword.getText();
        System.out.println(String.format("Email: %s, Password: %s", email, password));
        if(email.equals("admin") && password.equals("1234")) {
            Stage loginViewStage = (Stage) (((Node) event.getSource()).getScene().getWindow());
            Main.changeCurrentStage(loginViewStage, "/hrsystem/main/fxml/main.fxml");
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