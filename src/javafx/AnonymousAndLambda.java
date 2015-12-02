package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - Anonymous Inner Classes and Lambda Expressions
 * 
 * @author tomasz
 *
 */

public class AnonymousAndLambda extends Application {

	private Button button;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Java Fx application - Anonymous Inner Classes and Lambda Expressions");

		button = new Button();
		button.setText("Click me");

		// another way to set on action event, now you not must to check a event
		// source
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// executes action
				System.out.println("You clicked button");

				// using lambda expression - it is so easy and clean
				button.setOnAction(e -> System.out.println("JAVA 8 lambda expression"));

			}
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
