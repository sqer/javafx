package javafx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Java Fx application - Extract and Validate Input
 * 
 * @author tomasz
 *
 */

public class Form extends Application {

	private Stage window;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Java Fx application - Extract and Validate Input ");

		GridPane gridLayout = new GridPane();
		// sets padding to grid
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);

		// Components
		Label formName = new Label("Contact form");
		Label contactNameLabel = new Label("Name");
		TextField contactName = new TextField();
		Label messageLabel = new Label("Message");
		TextArea message = new TextArea();
		Button buttonSubmit = new Button("Submit");

		buttonSubmit.setOnAction(e -> {
			if (isNotEmpty(contactName,"Please enter contact name")) {
				System.out.println(contactName.getText());
			}
		});

		GridPane.setConstraints(formName, 0, 0, 2, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(contactNameLabel, 0, 1);
		GridPane.setConstraints(contactName, 1, 1);
		GridPane.setConstraints(messageLabel, 0, 2);
		GridPane.setConstraints(message, 1, 2);
		GridPane.setConstraints(buttonSubmit, 1, 3);
		gridLayout.getChildren().addAll(formName, contactNameLabel, contactName, messageLabel, message, buttonSubmit);

		Scene scene = new Scene(gridLayout, 700, 250);
		window.setScene(scene);
		window.show();
	}

	private boolean isNotEmpty(TextInputControl input, String message) {
		if (input.getText() != null && !input.getText().isEmpty()) {
			input.setStyle("-fx-background-color: green;");
			return true;
		} else {
			input.setPromptText(message);
			input.setStyle("-fx-background-color: red;");
			return false;
		}
	}

}
