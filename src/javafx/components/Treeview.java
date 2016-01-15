package javafx.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.GridPane;

public class Treeview {

	public static GridPane getExample() {
		GridPane gridLayout = new GridPane();
		gridLayout.setPadding(new Insets(10, 10, 10, 10));
		gridLayout.setVgap(8);
		gridLayout.setHgap(10);

		// Label
		Label label = new Label("TreeView example:");

		// tree view
		TreeView<String> tree;
		TreeItem<String> root, languages, tools, paid, free;

		root = new TreeItem<String>();
		root.setExpanded(true);

		languages = makeBranch("languages", root);
		tools = makeBranch("tools", root);
		paid = makeBranch("paid", tools);
		free = makeBranch("free", tools);
		makeBranch("IntelliJ", paid);
		makeBranch("Eclipse", free);
		makeBranch("NetBeans", free);
		makeBranch("Java", languages);
		makeBranch("C++", languages);
		makeBranch("C#", languages);

		tree = new TreeView<>(root);
		tree.setShowRoot(false);

		tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Changed selection from " + oldValue + " to " + newValue);
		});

		// button
		Button button = new Button("Ok");

		// options
		button.setOnAction(e -> {
			System.out.println("Selected:" +tree.getSelectionModel().getSelectedItem());
		});

		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(tree, 0, 1);
		GridPane.setConstraints(button, 0, 2);
		gridLayout.getChildren().addAll(label, tree, button);

		return gridLayout;
	}

	public static TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> newItem = new TreeItem<String>(title);
		newItem.setExpanded(false);
		parent.getChildren().add(newItem);
		return newItem;
	}
}
