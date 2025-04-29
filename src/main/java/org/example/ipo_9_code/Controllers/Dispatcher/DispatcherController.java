package org.example.ipo_9_code.Contollers.Dispatcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DispatcherController {


    @FXML void openTripEditWindow(String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/ipo_9_code/Views/trip-edit-view.fxml"));
            Parent root = loader.load();

            TripEditController controller = loader.getController();
            controller.setTitle(title);

            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();

            // Закрываем текущее окно (если нужно)
            ((Stage) createTripButton.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}