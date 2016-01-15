package javafx.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Combobox {

	public static GridPane getExample() {
		GridPane gridLayout = new GridPane();
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);

		// Label
		Label label = new Label("Choice favorite language:");

		// combobox
		ComboBox<String> combo = new ComboBox<>();
		combo.getItems().addAll("Java","C++", "C#");
		

		// button
		Button button = new Button("Ok");

		// options
		combo.setOnAction(e-> System.out.println("Selected: " + combo.getValue()));
		combo.setPromptText("What is your favourite language?");
		combo.setEditable(true);
		
		button.setOnAction(e -> {
			System.out.println("Favorite language: " + combo.getValue());

		});

		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(combo, 0, 1);
		GridPane.setConstraints(button, 0, 2);
		gridLayout.getChildren().addAll(label, combo, button);

		return gridLayout;
	}
}
