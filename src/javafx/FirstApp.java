package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * First simple Java Fx application
 * 
 * @author tomasz
 *
 */

// all core functionality is in javafx.application.Application which we must to
// extend
public class FirstApp extends Application {

	// java fx button
	private Button button;

	public static void main(String... args) {
		// set up program as a java fx application
		launch(args);
	}

	// Method will be called after launch finish job
	@Override
	public void start(Stage primaryStage) throws Exception {
		// stage = application window

		// sets window title
		primaryStage.setTitle("My first simple Java Fx application");

		// button without configuration
		button = new Button();

		// simply sets text on button
		button.setText("Click me");

		// simple layout
		StackPane layout = new StackPane();

		// adds button as a child of layout
		layout.getChildren().add(button);

		// content of application - will be created with use of given layout
		Scene scene = new Scene(layout, 500, 250);
		
		//Sets the scene for window
		primaryStage.setScene(scene);
		
		//Shows window
		primaryStage.show();
	}
}
