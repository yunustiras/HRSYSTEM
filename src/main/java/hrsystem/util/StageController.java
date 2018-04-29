package hrsystem.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StageController {
    public static void switchStage(Stage stage, String fxmlScenePath) throws IOException {
        System.out.println(fxmlScenePath);
        stage.setTitle("HRSystem");
        AnchorPane root = FXMLLoader.load(StageController.class.getResource(fxmlScenePath));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
