package org.example.homeassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ResourceBundle;

public class HelloController {
    public Button button1;

    public Button button2;

    public Button button3;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
    public void initialize() {
//        ResourceBundle bundle = ResourceBundle.getBundle("bundle2");
//        button1.setText(bundle.getString("button1.text"));
//        button2.setText(bundle.getString("button2.text"));
//        button3.setText(bundle.getString("button3.text"));
    }

    public void setEN(ActionEvent actionEvent) {

    }

    public void setIR(ActionEvent actionEvent) {


    }

    public void setJP(ActionEvent actionEvent) {

    }
}