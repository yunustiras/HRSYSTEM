package hrsystem;
	
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import hrsystem.util.StageController;
public class App extends Application {
    public static String FxmlScenePath = "/hrsystem/fxml/login.fxml";
    public static void main(String[] args) {
        launch(args);
    }

    @Override
	public void start(Stage primaryStage) {
        try {
            StageController.switchStage(primaryStage, App.FxmlScenePath);
        }
        catch (IOException e) {
            System.out.println("Login.fxml doesn't exists.");
        }
	}
}
