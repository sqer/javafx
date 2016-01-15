package javafx.components;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Checkbox {

	public static GridPane getExample() {
		GridPane gridLayout = new GridPane();
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);
		
		//Label
		Label label = new Label("What languages you know:");
		
		// checkboxes
		CheckBox box1 = new CheckBox("Java");
		CheckBox box2 = new CheckBox("C++");
		CheckBox box3 = new CheckBox("C#");
		// button
		Button button = new Button("Ok");

		// options
		box1.setSelected(true);
		button.setOnAction(e -> {
			List<String> languages = new ArrayList<String>();
			if(box1.isSelected()){
				languages.add("Java");
			}
			if(box2.isSelected()){
				languages.add("C++");
			}
			if(box3.isSelected()){
				languages.add("C#");
			}
			
			System.out.println("Known languages: "+languages.toString());
		});

		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(box1, 0, 1);
		GridPane.setConstraints(box2, 0, 2);
		GridPane.setConstraints(box3, 0, 3);
		GridPane.setConstraints(button, 0, 4);
		gridLayout.getChildren().addAll(label,box1, box2, box3, button);

		return gridLayout;
	}
	
}
