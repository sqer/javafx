package javafx.chart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PieChartSample extends Application {
	 
    @Override public void start(Stage stage) {
    	AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane);
        stage.setTitle("Programming languages");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Java", 13),
                new PieChart.Data("C++", 25),
                new PieChart.Data("C#", 10),
                new PieChart.Data("Scala", 22),
                new PieChart.Data("Php", 30));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Imported Fruits");
        chart.setAnimated(true);
        
        pane.getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
