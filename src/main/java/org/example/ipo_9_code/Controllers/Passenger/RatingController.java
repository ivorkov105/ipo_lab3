package org.example.ipo_9_code.Controllers.Passenger;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class RatingController implements Initializable {

    @FXML
    private ComboBox<String> complaintReasonComboBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        complaintReasonComboBox.setItems(FXCollections.observableArrayList(
                "Водитель",
                "Транспортное средство",
                "Рейс"
        ));
    }
}