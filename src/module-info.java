module WeatherApplication {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires json.simple;
    requires junit;
   // requires mockito.all;

    opens ro.mta.se.lab;
    opens ro.mta.se.lab.Controller;
    opens ro.mta.se.lab.Model;
    opens ro.mta.se.lab.View;
    opens ro.mta.se.lab.Resources;
    opens ro.mta.se.lab.Test;
}