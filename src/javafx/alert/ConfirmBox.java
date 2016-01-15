package javafx.alert;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Java Fx application - confirm box
 * 
 * @author tomasz
 *
 */
public class ConfirmBox {

	static boolean answer;

	// return answer on close
	public static boolean display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(300);

		Label label = new Label(message);
		// buttons
		Button buttonYes = new Button("Yes");
		Button buttonNo = new Button("No");

		// Set on action events
		buttonYes.setOnAction(e -> {
			answer = true;
			window.close();
		});

		buttonNo.setOnAction(e -> {
			answer = false;
			window.close();
		});

		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(label, buttonYes, buttonNo);
		vBox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.showAndWait();

		return answer;
	}



}
