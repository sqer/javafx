package javafx;

import javafx.application.Application;
import javafx.components.Listview;
import javafx.components.Tableview;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Java Fx application - Style
 * 
 * @author tomasz
 *
 */

public class Style extends Application {

	private Stage window;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Java Fx application - Style");
		

		BorderPane pane = new BorderPane();
		pane.setCenter(Tableview.getExample());
		pane.getStylesheets().add(this.getClass().getResource("style.css").toString());
		
		VBox vBox = new VBox();
		vBox.setMinWidth(vBox.getMaxWidth());
		vBox.setMinHeight(vBox.getMaxHeight());
		vBox.setStyle("-fx-background-color:#000000");
		vBox.getChildren().add(Listview.getExample());
		pane.setRight(vBox);
		
		MenuBar menuBar = new MenuBar();
		menuBar.setStyle("-fx-background-color: #400057");
		menuBar.setMinWidth(1000);
		Menu menuFile = new Menu("File");
		Menu menuEdit = new Menu("Edit");
		Menu menuView = new Menu("Source");
		menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
		MenuItem menuItemOpen = new MenuItem("Open");
		MenuItem menuItemSave = new MenuItem("Save");
		
		
		// add style by class name 
		menuItemOpen.getStyleClass().add("openMenuItem");
		// add style by id
		menuItemSave.setId("saveMenuItem");
		
		
		menuFile.getItems().add(menuItemOpen);
		menuFile.getItems().add(menuItemSave);
		
		HBox hBox = new HBox();
		hBox.setFillHeight(true);
		hBox.getChildren().addAll(menuBar);
		pane.setTop(hBox);

		Scene scene = new Scene(pane, 1000, 250);
		window.setScene(scene);
		window.show();
	}

}
