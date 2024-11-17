package org.example.demoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BankApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BankApp.class.getResource("LoginFace.fxml"));
        Scene loginScene = new Scene(fxmlLoader.load(), 600, 450);
        primaryStage.setTitle("Bank");
        primaryStage.setScene(loginScene);
        primaryStage.show();

    }

}
