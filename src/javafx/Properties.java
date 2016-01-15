package javafx;

import javafx.application.Application;
import javafx.properties.Company;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Java Fx application - Properties
 * 
 * @author tomasz
 *
 */

public class Properties extends Application {

	private Stage window;

	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Java Fx application - Properties");

		Company company = new Company();
		
		// add listener to company name value
		company.nameProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Company name changed from " + oldValue + " to " + newValue);
			System.out.println("Company name:" + company.getName());
		});
		
		
		
		// add listener to company name value
		company.industryProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Company industry changed from " + oldValue + " to " + newValue);
			System.out.println("Company industry:" + company.getIndustry());
		});
		
		Button buttonOracle = new Button("Oracle");
		buttonOracle.setOnAction(e-> company.setName("Oracle"));
		Button buttonApple = new Button("Apple");
		buttonApple.setOnAction(e-> company.setName("Apple"));
		
		//binding
		Label companyNameLabel = new Label();
		companyNameLabel.textProperty().bind(company.nameProperty());
		
		Label labelInfo = new Label("TextField bind example");
		TextField textFieldExample = new TextField();
		Label labelExample = new Label();
		labelExample.textProperty().bind(textFieldExample.textProperty());
		
		//LAYOUT
		HBox hBoxCenter = new HBox();
		hBoxCenter.getChildren().addAll(buttonOracle,buttonApple);
		HBox hBoxBottom = new HBox();
		hBoxBottom.getChildren().addAll(labelInfo,textFieldExample,labelExample);
		StackPane stack = new StackPane();
		stack.getChildren().add(companyNameLabel);

		BorderPane pane = new BorderPane();
		pane.setCenter(hBoxCenter);
		pane.setTop(stack);
		pane.setBottom(hBoxBottom);

		Scene scene = new Scene(pane, 1000, 250);
		window.setScene(scene);
		window.show();
	}

}
