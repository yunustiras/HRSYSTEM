package hrsystem;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

import hrsystem.util.StageController;
public class Main extends Application {
    public static String FxmlScenePath = "/hrsystem/login/fxml/login.fxml";
    public static void main(String[] args) {
        launch(args);
    }

    @Override
	public void start(Stage primaryStage) {
        try {
            StageController.switchStage(primaryStage, Main.FxmlScenePath);
        }
        catch (IOException e) {
            System.out.println("Login.fxml doesn't exists.");
        }
	}
}
