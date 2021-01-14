package ro.mta.se.lab.Model;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

/**
 * Acesta clasa este folosita pentru a crea un AlertBox in care sa se afiseze detaliile legate de
 * vremea in orasul selectat.
 *
 * @author Runcan Lacramioara
 */

public class AlertBox {
    Alert alert;
    /**
     *Constructorul clasei AlertBox,in care se seteaza tipul alertei ca fiind INFORMATION
     * Acest lucru semalizeaza faptul ca datele din alertbox vor fi informative.
     */

    public AlertBox() {
        alert = new Alert(Alert.AlertType.INFORMATION);
    }

    /**
     * Acesta functie seteaza titlul,continutul si textul care vor aparea in AlertBox
     */
    public void displayWeather(String title, String message, String exit_message)
    {

        this.alert.setTitle(title);
        this.alert.setHeaderText(message);
        this.alert.setResizable(false);
        this.alert.setContentText(exit_message);
        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.OK);

     }
}
