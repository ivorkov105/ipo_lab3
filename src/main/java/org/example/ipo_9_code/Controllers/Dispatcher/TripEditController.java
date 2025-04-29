package org.example.ipo_9_code.Controllers.Dispatcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class TripEditController {

    @FXML private ComboBox<String> departureComboBox;
    @FXML private ComboBox<String> arrivalComboBox;
    @FXML private ComboBox<String> driverComboBox;
    @FXML private ComboBox<String> busComboBox;

    @FXML
    private void initialize() {
        departureComboBox.getItems().addAll("Москва", "Санкт-Петербург", "Казань", "Нижний Новгород", "Екатеринбург", "Челябинск");
        arrivalComboBox.getItems().addAll("Москва", "Санкт-Петербург", "Казань", "Нижний Новгород", "Екатеринбург", "Челябинск");

        driverComboBox.getItems().addAll("Иванов И.И.", "Петров П.П.", "Сидоров С.С.");
        busComboBox.getItems().addAll("Mercedes-Benz Travego (45 мест)", "Volvo 9900 (50 мест)", "Setra S 517 HDH (45 мест)");
    }

    @FXML
    private void returnToMainWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("dispatcher/dispatcher-view.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setTitle("Панель диспетчера");
        stage.setScene(new Scene(root));
        stage.show();

        ((Stage) departureComboBox.getScene().getWindow()).close();
    }
}