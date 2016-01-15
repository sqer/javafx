package javafx.components;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.table.Language;

public class Tableview {
	
	static TextField nameInput = new TextField();
	static DatePicker lastUpdateDatePicker = new DatePicker();
	static TextField versionInput = new TextField();
	static TableView<Language> table = new TableView<Language>(getLanguages());

	public static GridPane getExample() {
		GridPane gridLayout = new GridPane();
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);

		// Label
		Label label = new Label("TableView example:");

		// table view

		TableColumn<Language, String> nameColumn = new TableColumn<>("Name");
		TableColumn<Language, LocalDate> lastUpdateDateColumn = new TableColumn<>("Last update date");
		TableColumn<Language, String> versionColumn = new TableColumn<>("Version");

		// options
		nameColumn.setMinWidth(60);
		lastUpdateDateColumn.setMinWidth(200);
		versionColumn.setMinWidth(100);
		nameColumn.setCellValueFactory(new PropertyValueFactory<Language, String>("name"));
		lastUpdateDateColumn.setCellValueFactory(new PropertyValueFactory<Language, LocalDate>("lastUpdateDate"));
		versionColumn.setCellValueFactory(new PropertyValueFactory<Language, String>("version"));

	
		table.getColumns().addAll(nameColumn, lastUpdateDateColumn, versionColumn);
		table.setMinWidth(360);

		// Fields
		nameInput.setPromptText("Langauge name");
		lastUpdateDatePicker.setPromptText("Last update date");
		versionInput.setPromptText("Version");
		
		Button addRow = new Button("Add");
		addRow.setOnAction(e -> addButtonAction());

		Button delRow = new Button("Del");
		delRow.setOnAction(e -> delButtonAction());

		HBox hbox = new HBox();
		hbox.getChildren().addAll(nameInput, lastUpdateDatePicker, versionInput, addRow, delRow);

		// button
		Button button = new Button("Ok");

		// options

		button.setOnAction(e -> {
			System.out.println("Selected row: " + table.getSelectionModel().getSelectedItem());
		});

		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(table, 0, 1);
		GridPane.setConstraints(button, 0, 2);
		GridPane.setConstraints(hbox, 0, 3, 2, 1);

		gridLayout.getChildren().addAll(label, table, hbox, button);

		return gridLayout;
	}

	public static void addButtonAction(){
		table.getItems().add(new Language(nameInput.getText(), lastUpdateDatePicker.getValue(), versionInput.getText()));
	}
	
	public static void delButtonAction(){
		ObservableList<Language> selected,all;
		all= table.getItems();
		selected= table.getSelectionModel().getSelectedItems();
		
		selected.forEach(all::remove);
	}
	
	public static ObservableList<Language> getLanguages() {
		ObservableList<Language> items = FXCollections.observableArrayList();
		items.add(new Language("Java", LocalDate.parse("2015-10-20", DateTimeFormatter.ISO_DATE), "1.8.0_65"));
		items.add(new Language("C++", LocalDate.parse("2014-12-15", DateTimeFormatter.ISO_DATE), "ISO/IEC 14882:2014"));
		items.add(new Language("C#", LocalDate.parse("2012-08-15", DateTimeFormatter.ISO_DATE), "5.0"));
		return items;
	}
}
