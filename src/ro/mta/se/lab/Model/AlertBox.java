package ro.mta.se.lab.Model;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
