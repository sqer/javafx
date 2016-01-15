package javafx;


import javafx.alert.AlertBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - creating alert boxes 
 *   
 * @author tomasz
 *
 */

public class CreatingAlertBoxes extends Application {

	private Button button;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Java Fx application - creating alert boxes ");

		button = new Button();
		button.setText("Click me");
		button.setOnAction(e->AlertBox.display("Simple alert box", "Simple message for the user"));

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 500, 250);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}
