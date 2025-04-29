package org.example.ipo_9_code.Controllers.Passenger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class TripDetailsController {

    @FXML
    public void goBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("passenger/passenger-view.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            
            stage.setTitle("Панель пассажира");
            stage.setScene(new Scene(root, 800, 600));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void buySeat() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("passenger/payment-window.fxml"));
            Parent root = loader.load();
            
            Stage paymentStage = new Stage();
            paymentStage.setTitle("Оплата билета");
            paymentStage.setScene(new Scene(root));
            paymentStage.showAndWait();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 