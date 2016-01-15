package javafx.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Choicebox {

	public static GridPane getExample() {
		GridPane gridLayout = new GridPane();
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);

		// Label
		Label label = new Label("Choice favorite language:");

		// choicebox
		ChoiceBox<String> choice = new ChoiceBox<>();
		choice.getItems().add("Java");
		choice.getItems().add("C++");
		choice.getItems().add("C#");

		// Listening for Selection Changes 
		choice.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> System.out.println("Changed '" + oldValue + " to " + newValue));
		// button
		Button button = new Button("Ok");

		// options
		choice.setValue("Java");
		button.setOnAction(e -> {
			System.out.println("Favorite language: " + choice.getValue());

		});

		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(choice, 0, 1);
		GridPane.setConstraints(button, 0, 2);
		gridLayout.getChildren().addAll(label, choice, button);

		return gridLayout;
	}
}
