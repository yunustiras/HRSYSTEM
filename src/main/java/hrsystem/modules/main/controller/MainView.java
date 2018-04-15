package hrsystem.modules.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainView implements Initializable {

    @FXML
    private TextField search_text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    @FXML
    public void search() {
        System.out.println(search_text.getText());
    }

    @FXML
    public void handleSearchButtonAction(ActionEvent event){
        System.out.println(String.format("Will Search Project at %s",search_text.getText()));
    }
}