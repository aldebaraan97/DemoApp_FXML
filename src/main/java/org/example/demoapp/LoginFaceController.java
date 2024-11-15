package org.example.demoapp;

import com.almasb.fxgl.scene.Scene;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import org.example.demoapp.BankApp.*;

public class LoginFaceController extends Application {

    @FXML
    protected void loginButtonAction(ActionEvent event) {
        FXMLLoader bankScene = new FXMLLoader(getClass().getResource("BankMainFace.fxml"));
//        BankApp.;
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
