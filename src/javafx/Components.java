package javafx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.application.Application;
import javafx.components.Checkbox;
import javafx.components.Choicebox;
import javafx.components.Combobox;
import javafx.components.Listview;
import javafx.components.Tableview;
import javafx.components.Treeview;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - Components
 * 
 * @author tomasz
 *
 */

public class Components extends Application {

	private Stage window;

	private List<Pane> layouts = new ArrayList<>();

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Java Fx application - Components ");
		
		layouts.add(Checkbox.getExample());
		layouts.add(Choicebox.getExample());
		layouts.add(Combobox.getExample());
		layouts.add(Listview.getExample());
		layouts.add(Treeview.getExample());
		layouts.add(Tableview.getExample());
		
		Iterator iterator = layouts.iterator();

		BorderPane pane = new BorderPane();
		pane.setCenter((Node) iterator.next());


		// button
		Button button = new Button("Next");
		button.setOnAction(e -> {
			if (iterator.hasNext()) {
				pane.setCenter((Node) iterator.next());
			}
		});

		StackPane buttonPane = new StackPane();
		buttonPane.getChildren().add(button);
		pane.setBottom(buttonPane);

		Scene scene = new Scene(pane, 700, 250);
		window.setScene(scene);
		window.show();
	}

}
