package org.example.ipo_9_code.Contollers.Dispatcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class TripEditController {

    @FXML private ImageView tripImageView;
    @FXML private Button selectImageButton;
    @FXML private ComboBox<String> departureComboBox;
    @FXML private ComboBox<String> arrivalComboBox;
    @FXML private DatePicker departureDatePicker;
    @FXML private ComboBox<String> driverComboBox;
    @FXML private ComboBox<String> busComboBox;
    @FXML private TextField priceTextField;
    @FXML private TextField stopPointTextField;
    @FXML private Button addStopButton;
    @FXML private ListView<String> stopPointsListView;
    @FXML private Button cancelButton;
    @FXML private Button saveButton;

    private String title;

    @FXML
    private void initialize() {
        // Инициализация ComboBox
        departureComboBox.getItems().addAll("Москва", "Санкт-Петербург", "Казань", "Нижний Новгород", "Екатеринбург", "Челябинск");
        arrivalComboBox.getItems().addAll("Москва", "Санкт-Петербург", "Казань", "Нижний Новгород", "Екатеринбург", "Челябинск");

        driverComboBox.getItems().addAll("Иванов И.И.", "Петров П.П.", "Сидоров С.С.");
        busComboBox.getItems().addAll("Mercedes-Benz Travego (45 мест)", "Volvo 9900 (50 мест)", "Setra S 517 HDH (45 мест)");

        // Обработчик для кнопки выбора изображения
        selectImageButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Выберите изображение рейса");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Изображения", "*.png", "*.jpg", "*.jpeg")
            );
            File selectedFile = fileChooser.showOpenDialog(selectImageButton.getScene().getWindow());
            if (selectedFile != null) {
                tripImageView.setImage(new Image(selectedFile.toURI().toString()));
            }
        });

        // Обработчик для добавления остановки
        addStopButton.setOnAction(event -> {
            if (!stopPointTextField.getText().isEmpty()) {
                stopPointsListView.getItems().add(stopPointTextField.getText());
                stopPointTextField.clear();
            }
        });

        // Обработчик для кнопки отмены
        cancelButton.setOnAction(event -> {
            try {
                returnToMainWindow();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Обработчик для кнопки сохранения
        saveButton.setOnAction(event -> {
            // Здесь должна быть логика сохранения данных
            try {
                returnToMainWindow();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private void returnToMainWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/ipo_9_code/Views/dispatcher-main-view.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setTitle("Панель диспетчера");
        stage.setScene(new Scene(root));
        stage.show();

        // Закрываем текущее окно
        ((Stage) cancelButton.getScene().getWindow()).close();
    }
}