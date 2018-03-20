package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("HRSystem");
		initHomeLayout();
	}
	
	public void initHomeLayout(){
		try {
			//load home layout
	        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/HomePage.fxml"));
            rootLayout = (BorderPane) loader.load();
            
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
