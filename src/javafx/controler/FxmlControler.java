package javafx.controler;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

// controler contains logic for fxml file. Controler can implements initializable then initialize method will be executed on startup 
public class FxmlControler implements Initializable{

	//must be public, name of variable must be equal to fx:id
	public Label labelForButton;

	
	//button action
	public void buttonOnAction() {
		labelForButton.setText("Green");
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
