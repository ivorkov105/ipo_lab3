package org.example.ipo_9_code.Controllers.Cashier;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class CashierController {
    @FXML
    Label login;

    @FXML
    void login() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("cashier/cashier-pass-view.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Панель пассажира");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
