package javafx;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Java Fx application - embedding layouts
 * 
 * @author tomasz
 *
 */

public class EmbeddingLayouts extends Application {

	private Stage window;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Java Fx application - embedding layouts");

		MenuBar menuBar = new MenuBar();
		menuBar.setMinWidth(500);

		// --- Menu File
		Menu menuFile = new Menu("File");
		// --- Menu Edit
		Menu menuEdit = new Menu("Edit");
		// --- Menu View
		Menu menuView = new Menu("Source");
		menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

		MenuItem menuItemOpen = new MenuItem("Open");

		menuFile.getItems().add(menuItemOpen);

		// horizontal box, Java have a lot of libraries with ready to use menus.
		// Not use HBox

		HBox hMenuLayout = new HBox();
		hMenuLayout.setFillHeight(true);
		hMenuLayout.getChildren().addAll(menuBar);

		// vertical box
		MenuButton menuButton = new MenuButton("Options");
		menuButton.getItems()
				.addAll(Stream.of("Info", "New", "Open", "Save", "Save As", "Print", "Share", "Export", "Close")
						.map(MenuItem::new).collect(Collectors.toList()));
		VBox vMenuLayout = new VBox();
		vMenuLayout.getChildren().addAll(menuButton);
		vMenuLayout.setAlignment(Pos.CENTER);
		
		StackPane stack = new StackPane();
		stack.setStyle("-fx-background-color: grey;");

		
		// embed hMenuLayout and vMenuLayout
		BorderPane borderPaneLayout = new BorderPane();
		borderPaneLayout.setTop(hMenuLayout);
		borderPaneLayout.setRight(vMenuLayout);
		borderPaneLayout.setCenter(stack);
		
		Scene scene = new Scene(borderPaneLayout, 500, 250);
		window.setScene(scene);
		window.show();
	}

}
