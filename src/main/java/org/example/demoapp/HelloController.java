package org.example.demoapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField tfNumber1, tfNumber2, tfResult;

    @FXML
    protected void addButtonAction(ActionEvent event) {
        tfResult.setText(getResult('+') + "");
    }

    @FXML
    protected void subtractButtonAction(ActionEvent event) {
        tfResult.setText(getResult('-') + "");
    }

    @FXML
    protected void multiButtonAction(ActionEvent event) {
        tfResult.setText(getResult('*') + "");
    }

    @FXML
    protected void divideButtonAction(ActionEvent event) {
        tfResult.setText(getResult('/') + "");
    }

    private double getResult(char op) {
        double number1 = Double.parseDouble(tfNumber1.getText());
        double number2 = Double.parseDouble(tfNumber2.getText());
        switch (op) {
            case '+': return number1 + number2;
            case '-': return number1 - number2;
            case '*': return number1 * number2;
            case '/': return number1 / number2;
        }
        return Double.NaN;
    }
}