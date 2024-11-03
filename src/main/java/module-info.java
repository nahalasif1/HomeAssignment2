module org.example.homeassignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.homeassignment2 to javafx.fxml;
    exports org.example.homeassignment2;
}