package hrsystem;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private AnchorPane rootLayout;
	
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
            loader.setLocation(Main.class.getResource("/hrsystem/view/HomePage.fxml"));
            rootLayout = (AnchorPane) loader.load();
            
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
