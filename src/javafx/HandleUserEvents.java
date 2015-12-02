package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - Handle User Events
 * 
 * @author tomasz
 *
 */

// class implements simple event handler - action event
public class HandleUserEvents extends Application implements EventHandler<ActionEvent> {


	private Button button;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Java Fx application - Handle User Events");

		button = new Button();
		button.setText("Click me");

		// set event handler for button, on click method handle from this class will be executed.
		button.setOnAction(this);
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// every time when you click a button method will be executed
	@Override
	public void handle(ActionEvent event) {
		
		//We can check which component executes the action
		if(event.getSource()==button){
			//executes action specific for component
			System.out.println("You clicked button");
		}

	}
}
