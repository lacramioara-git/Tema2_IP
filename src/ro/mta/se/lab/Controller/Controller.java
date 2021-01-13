package ro.mta.se.lab.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import org.json.simple.parser.ParseException;
import ro.mta.se.lab.Model.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    private WeatherAPIClass WeatherAPI;
    private WeatherInfoInterface  CityWeather;
    private ReadInitialDataClass MyFileReader;
    @FXML
    ChoiceBox CountryId;
    @FXML
    ChoiceBox CityId;


    public Controller() {

        WeatherAPI = new WeatherAPIClass();

        MyFileReader=new ReadInitialDataClass();
        CountryId = new ChoiceBox();
        CityId = new ChoiceBox();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String filename="src/ro/mta/se/lab/Resources/Cities.txt";
        MyFileReader.ReadSetData(filename);
        MyFileReader.setSelectBox(CountryId,CityId);
    }


    public void onPressWeatherButton() throws ParseException, IOException {
        String response;
        String City = (String) CityId.getValue();
        WeatherAPI.setConnection(City, "metric", "en");
        response = WeatherAPI.getResponse();
        CityWeather = new CityWeather();
        CityWeather.setParameters(response);
        String title = City + " Weather";
        String exitmsg="I hope it helped. Have a nice day!";
        AlertBox alert=new AlertBox();
        alert.displayWeather(title,CityWeather.display(),exitmsg);
    }
}
