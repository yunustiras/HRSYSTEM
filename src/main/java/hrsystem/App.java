package hrsystem;

import java.io.IOException;

import hrsystem.util.SQLiteJDBC;
import javafx.application.Application;
import javafx.stage.Stage;

import hrsystem.util.StageController;
import hrsystem.util.ConfirmBox;

public class App extends Application {
    public static String FxmlScenePath = "/hrsystem/fxml/login.fxml";
    public static void main(String[] args) {
        try {
            SQLiteJDBC.isHaveDriver();
        } catch (Exception e) {
            System.out.println("You dont have sqlite jdbc driver");
        }
        launch(args);
    }

    @Override
	public void start(Stage primaryStage) {
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            Boolean answer = ConfirmBox.display("Exit", "Are you want to exit?");
            if (answer == true) {
                primaryStage.close();
            }
        });
        try {
            StageController.switchStage(primaryStage, App.FxmlScenePath);
        }
        catch (IOException e) {
            System.out.println("Login.fxml doesn't exists.");
        }
	}
}

