package org.example.ipo_9_code.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.ipo_9_code.Additional.UserType;
import org.example.ipo_9_code.Main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RegistrationController {
    @FXML
    private TextField loginField;

    @FXML
    private Button loginButton;

    private final Map<String, UserType> userCredentials = new HashMap<>() {{
        put("pass", UserType.PASSENGER);
        put("driv", UserType.DRIVER);
        put("admin", UserType.ADMIN);
        put("disp", UserType.DISPATCHER);
        put("cash", UserType.CASHIER);
    }};

    @FXML
    public void initialize() {
        loginButton.setOnAction(_ -> login());
    }

    private void login() {
        String login = loginField.getText();
        UserType userType = userCredentials.get(login);
        if (userType != null) {
            openUserPanel(userType);
        }
    }

    private void openUserPanel(UserType userType) {
        String fxmlFile;
        String title;

        switch (userType) {
            case PASSENGER:
                fxmlFile = "passenger/passenger-view.fxml";
                title = "Панель пассажира";
                break;
            case DRIVER:
                fxmlFile = "driver/driver-view.fxml";
                title = "Панель водителя";
                break;
            case ADMIN:
                fxmlFile = "admin/admin-view.fxml";
                title = "Панель администратора";
                break;
            case DISPATCHER:
                fxmlFile = "dispatcher/dispatcher-view.fxml";
                title = "Панель диспетчера";
                break;
            case CASHIER:
                fxmlFile = "cashier/cashier-view.fxml";
                title = "Панель кассира";
                break;
            default:
                return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlFile));
            Parent root = loader.load();

            Stage stage = (Stage) loginField.getScene().getWindow();
            stage.setTitle(title);
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

