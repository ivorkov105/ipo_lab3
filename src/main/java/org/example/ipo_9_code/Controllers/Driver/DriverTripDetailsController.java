package org.example.ipo_9_code.Controllers.Driver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class DriverTripDetailsController {
    
    @FXML
    public void goBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("driver/driver-view.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Панель водителя");
            Scene scene = new Scene(root, 800, 600);
            stage.setScene(scene);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 