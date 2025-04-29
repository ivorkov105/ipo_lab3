package org.example.ipo_9_code.Controllers.Driver;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class DriverController {

    @FXML
    private AnchorPane upcomingTrip1, upcomingTrip2, upcomingTrip3;

    @FXML
    public void openTripDetails(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("driver/driver-trip-details-view.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((AnchorPane) event.getSource()).getScene().getWindow();
            stage.setTitle("Подробная информация о рейсе");
            Scene scene = new Scene(root, 800, 600);
            stage.setScene(scene);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 