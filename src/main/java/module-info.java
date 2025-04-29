module org.example.ipo_9_code {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ipo_9_code to javafx.fxml;
    exports org.example.ipo_9_code;
}