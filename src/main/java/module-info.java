module org.example.ipo_9_code {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ipo_9_code to javafx.fxml;
    exports org.example.ipo_9_code;
    exports org.example.ipo_9_code.Additional;
    opens org.example.ipo_9_code.Additional to javafx.fxml;
    exports org.example.ipo_9_code.Controllers.Dispatcher;
    opens org.example.ipo_9_code.Controllers.Dispatcher to javafx.fxml;
    exports org.example.ipo_9_code.Controllers.Driver;
    opens org.example.ipo_9_code.Controllers.Driver to javafx.fxml;
    exports org.example.ipo_9_code.Controllers.Passenger;
    opens org.example.ipo_9_code.Controllers.Passenger to javafx.fxml;
    exports org.example.ipo_9_code.Controllers.Cashier;
    opens org.example.ipo_9_code.Controllers.Cashier to javafx.fxml;
    exports org.example.ipo_9_code.Controllers;
    opens org.example.ipo_9_code.Controllers to javafx.fxml;
}