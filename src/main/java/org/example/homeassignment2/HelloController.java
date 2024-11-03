package org.example.homeassignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
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
    public void loadView(Locale locale) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("bundle", locale));  // Load the resource bundle for the chosen language
        try {
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) button1.getScene().getWindow();  // Use an existing stage to load the new scene
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();  // Print error if loading fails
        }
    }
    private Label footerLabel;  // The label we'll use to display your name and time

    public void onEnglishButtonClick() {
        Locale locale = new Locale("en");
        loadView(locale);
        updateFooterLabel(locale);
    }

    public void onPersianButtonClick() {
        Locale locale = new Locale("fa");
        loadView(locale);
        updateFooterLabel(locale);
    }

    public void onJapaneseButtonClick() {
        Locale locale = new Locale("ja");
        loadView(locale);
        updateFooterLabel(locale);
    }
    private void updateFooterLabel(Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale);
        String time = LocalTime.now().format(formatter);
        footerLabel.setText("Your Name - " + time);  // Replace "Your Name" with your actual name
    }
}