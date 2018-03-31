package hrsystem;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
	public void start(Stage primaryStage) {
		this.window = primaryStage;
		this.window.setTitle("HRSystem");

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/hrsystem/main/fxml/main.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            this.window.setScene(scene);
            this.window.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
	}
}
