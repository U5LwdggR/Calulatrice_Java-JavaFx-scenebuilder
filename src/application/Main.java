package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader load = new FXMLLoader(getClass().getResource("calculatrice.fxml"));
			Parent root = load.load();
			Scene myScene = new Scene(root);
			primaryStage.setTitle("Calculatrce");
			primaryStage.setResizable(false);
			primaryStage.setScene(myScene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
