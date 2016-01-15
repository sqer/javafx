package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fxml extends Application {

	private Stage window;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Java Fx application - grid pane");

		// load fxml file
		Parent root = FXMLLoader.load(getClass().getResource("FxmlExmple.fxml"));

		window.setScene(new Scene(root, 300, 200));
		window.show();

	}

}
