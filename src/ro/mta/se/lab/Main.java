package ro.mta.se.lab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Acesta este clasa principala a proiectului.Mosteneste clasa abstracta Application.
 *
 * @author Runcan Lacramioara
 */

public class Main extends Application {

    /**
     * Acesta functie este cea de start a aplicatiei,se incarca fisierul FXML ,in care este descris
     * designul interfetei grafice.
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/ro/mta/se/lab/View/sample.fxml"));
        primaryStage.setTitle("WeatherApplication");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
