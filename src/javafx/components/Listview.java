package javafx.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;

public class Listview {

	public static GridPane getExample() {
		GridPane gridLayout = new GridPane();
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);

		// Label
		Label label = new Label("What languages you know:");

		// list view
		ListView<String> list = new ListView<>();
		list.getItems().addAll("Java", "C++", "C#") ;
		list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		// button
		Button button = new Button("Ok");

		// options

		
		button.setOnAction(e -> {
			System.out.println("Known languages: " + list.getSelectionModel().getSelectedItems());

		});

		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(list, 0, 1);
		GridPane.setConstraints(button, 0, 2);
		gridLayout.getChildren().addAll(label, list, button);

		return gridLayout;
	}
}
