package org.example.demoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 600, 450);
//        Scene scene2 = new Scene(fxmlLoader.load(), 600, 450);
        stage.setTitle("Calculator");
        stage.setScene(scene1);
        stage.show();
    }


}