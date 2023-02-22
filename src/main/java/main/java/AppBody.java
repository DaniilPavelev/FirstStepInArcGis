package main.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppBody extends Application{

    @Override
    public void start(Stage stage){
        stage.setTitle("less1");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane);
        stage.setScene(scene);


    }

}