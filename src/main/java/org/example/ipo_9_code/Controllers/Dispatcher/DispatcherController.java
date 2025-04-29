package org.example.ipo_9_code.Controllers.Dispatcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class DispatcherController {

    @FXML
    Label title;

    @FXML
    private void openTripEditWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("dispatcher/trip-edit-view.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Создание/Редактирование рейса");
            stage.setScene(new Scene(root));
            stage.show();

            ((Stage) title.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}