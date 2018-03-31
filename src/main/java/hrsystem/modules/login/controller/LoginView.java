package hrsystem.modules.login.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
}