package ro.mta.se.lab.Controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.json.simple.parser.ParseException;
import ro.mta.se.lab.Model.*;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {

    private WeatherAPIClass WeatherAPI;
    private CityWeather  CityWeather;
    private ReadInitialDataClass MyFileReader;
    @FXML
    ChoiceBox CountryId;
    @FXML
    ChoiceBox CityId;

    @FXML
    private Button WeatherId;


    public Controller() {

        WeatherAPI = new WeatherAPIClass();
        CityWeather = new CityWeather();
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


    public void onPressWeatherButton(ActionEvent actionEvent) throws ParseException, IOException {
        String response;
        String City= (String) CityId.getValue();
        WeatherAPI.setConnection(City,"metric","en");
        response=WeatherAPI.getResponse();
        CityWeather.setParameters(response);
        String title= City + " Weather";
        WeatherId.setOnAction(e-> AlertBox.displayWeather(title,CityWeather.display()));

    }
}
