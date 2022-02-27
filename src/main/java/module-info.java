module com.example.javafishes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafishes to javafx.fxml;
    exports com.example.javafishes;
}