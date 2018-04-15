package hrsystem;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	public Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
	public void start(Stage primaryStage) {
		this.window = primaryStage;
		this.window.setTitle("HRSystem");
		changeCurrentStage(window,"/hrsystem/login/fxml/login.fxml");
	}

	public static void changeCurrentStage(Stage stage,String fxmlScenePath){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource(fxmlScenePath));
            Scene scene = new Scene((AnchorPane)loader.load());
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
