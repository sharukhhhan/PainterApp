module com.example.paintapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paintapp to javafx.fxml;
    exports com.example.paintapp;
}