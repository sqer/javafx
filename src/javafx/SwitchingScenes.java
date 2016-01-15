package javafx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Java Fx application - switching scenes (like switching web pages)
 *   
 * @author tomasz
 *
 */

public class SwitchingScenes extends Application {

	/** window of app */
	Stage window; 
	/** pages */
	Scene scene1, scene2;


	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		
		//scene 1
		Label label1 = new Label("Welcome to the first scene!");
		Button button1= new Button("Next scene");
		button1.setOnAction(e-> window.setScene(scene2));
		VBox layout1 = new VBox(40);
		layout1.getChildren().addAll(label1,button1);
		scene1 = new Scene(layout1,200,200);
		
		//scene 2
		Button button2= new Button("Previous scene");
		button2.setOnAction(e-> window.setScene(scene1));
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2,200,200);
	
	
		//default scene
		window.setScene(scene1);
		window.setTitle("Java Fx application - switching scenes (like switching web pages)");
		window.show();
	}

}
