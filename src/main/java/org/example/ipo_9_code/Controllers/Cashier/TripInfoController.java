package org.example.ipo_9_code.Controllers.Cashier;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class TripInfoController {

    @FXML
    public void goBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("cashier/cashier-pass-view.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

            stage.setTitle("Панель пассажира");
            stage.setScene(new Scene(root, 800, 600));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
