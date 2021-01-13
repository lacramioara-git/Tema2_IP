package ro.mta.se.lab.Model;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class AlertBox {
    Alert alert;
    public AlertBox() {
        alert = new Alert(Alert.AlertType.INFORMATION);
    }

    public void displayWeather(String title, String message, String exit_message)
    {

        this.alert.setTitle(title);
        this.alert.setHeaderText(message);
        this.alert.setResizable(false);
        this.alert.setContentText(exit_message);
        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CLOSE);

     }
}
