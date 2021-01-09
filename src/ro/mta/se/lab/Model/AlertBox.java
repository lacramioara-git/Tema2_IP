package ro.mta.se.lab.Model;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void displayWeather(String title,String message)
    {
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(300);
        window.setMinWidth(300);
        Label label =new Label();
        label.setText(message);
        Button GoBack=new Button("Go Back");
        GoBack.setOnAction(e -> window.close());
        VBox layout =new VBox(20);
        layout.getChildren().addAll(label,GoBack);
        layout.setAlignment(Pos.CENTER);

        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

     }
}
