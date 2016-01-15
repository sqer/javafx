package javafx;

import javafx.alert.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - communicating between windows
 * 
 * @author tomasz
 *
 */

public class CommunicatingBetweenWindows extends Application {

	private Button button;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Java Fx application - communicating between windows");

		button = new Button();
		button.setText("Click me");
		button.setOnAction(e -> {
			boolean answer = ConfirmBox.display("Simple confirm box", "Are you sure?");
			System.out.println("Result: "+answer);
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 500, 250);

		primaryStage.setScene(scene);

		primaryStage.show();
	}
}
