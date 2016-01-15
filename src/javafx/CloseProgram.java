package javafx;

import javafx.alert.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - close program
 * 
 * @author tomasz
 *
 */

public class CloseProgram extends Application {

	private Stage window;
	private Button button;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("My first simple Java Fx application");

		button = new Button();
		button.setText("Close");
		button.setOnAction(e -> close());

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 500, 250);
		window.setScene(scene);

		window.show();

		// On close request action
		
		
		// window.setOnCloseRequest(e-> close());

		/*
		 * Properly
		 * window.setOnCloseRequest(
		 * 
		 * e -> { e.consume(); close(); });
		 */
	}

	private void close() {
		Boolean answer = ConfirmBox.display("Close program", "Are you sure that you want to close program?");
		if (answer) {
			window.close();
		}
	}

}
