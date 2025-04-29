package org.example.ipo_9_code.Controllers.Passenger;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.ipo_9_code.Main;

import java.io.IOException;

public class PassengerController {

    @FXML
    private ComboBox<String> departureComboBox;

    @FXML
    private ComboBox<String> arrivalComboBox;

    @FXML
    private ComboBox<String> dateComboBox;

    @FXML
    private ComboBox<String> busClassComboBox;
    
    @FXML
    private ComboBox<String> ratingComboBox;
    
    @FXML
    private AnchorPane trip1, trip2, trip3;

    @FXML
    public void initialize() {
        // Заполнение ComboBox данными
        departureComboBox.setItems(FXCollections.observableArrayList(
                "Москва", "Санкт-Петербург", "Казань", "Екатеринбург", "Новосибирск"
        ));

        arrivalComboBox.setItems(FXCollections.observableArrayList(
                "Москва", "Санкт-Петербург", "Казань", "Нижний Новгород", "Челябинск"
        ));

        dateComboBox.setItems(FXCollections.observableArrayList(
                "01.06.2024", "05.06.2024", "10.06.2024", "15.06.2024", "20.06.2024"
        ));

        busClassComboBox.setItems(FXCollections.observableArrayList(
                "Эконом", "Комфорт", "Бизнес", "Люкс"
        ));

        ratingComboBox.setItems(FXCollections.observableArrayList(
                "Не меньше 3", "Не меньше 4", "Не меньше 4.5", "Рейтинг 5"
        ));
    }

    @FXML
    public void openTripDetails(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("passenger/trip-details-view.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((AnchorPane) event.getSource()).getScene().getWindow();
            stage.setTitle("Подробная информация о рейсе");
            Scene scene = new Scene(root, 800, 600);
            stage.setScene(scene);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void showRatingMenu(ContextMenuEvent event) {
        ContextMenu contextMenu = new ContextMenu();
        MenuItem rateItem = new MenuItem("Оценить поездку");
        
        rateItem.setOnAction(_ -> openRatingWindow());
        
        contextMenu.getItems().add(rateItem);
        contextMenu.show(((AnchorPane) event.getSource()), event.getScreenX(), event.getScreenY());
    }
    
    @FXML
    public void showCancelMenu(ContextMenuEvent event) {
        ContextMenu contextMenu = new ContextMenu();
        MenuItem cancelItem = new MenuItem("Отменить бронирование");
        contextMenu.getItems().add(cancelItem);
        contextMenu.show(((AnchorPane) event.getSource()), event.getScreenX(), event.getScreenY());
    }
    
    private void openRatingWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("passenger/rating-window.fxml"));
            Parent root = loader.load();
            
            Stage ratingStage = new Stage();
            ratingStage.setTitle("Оценка поездки");
            ratingStage.setScene(new Scene(root));
            ratingStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}