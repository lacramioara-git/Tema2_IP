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
/**
 * Acesta clasa este implementata pentru a face legatura dintre interfata
 * grafica si logica din spate a proiectului
 *
 * @author Runcan Lacramioara
 */

public class Controller implements Initializable {

    /**
     * @param WeatherAPI - cu ajutorul lui obtinem raspunsul de la requstul catre server
     * @param CityWeather - retine datele legate de vreme
     * @param MyFileReader -folosit la citirea datelor initiale despre orase
     * @param History- folosit pentru a retine istoricul cautarilor informatiilor despre vreme in anumite orase
     * @param CountryId -id unic al choiceBox legat de tari
     * @param CityId - id unic al choiceBox legat de orase
     */
    private WeatherAPIClass WeatherAPI;
    private WeatherInfoInterface  CityWeather;
    private ReadInitialDataClass MyFileReader;
    private HistorySearchClass History;
    @FXML
    ChoiceBox CountryId;
    @FXML
    ChoiceBox CityId;


    /**
     * Constructorul clasei Controller
     *
     */
    public Controller() {

        WeatherAPI = new WeatherAPIClass();
        History=new HistorySearchClass();
        MyFileReader=new ReadInitialDataClass();
        CountryId = new ChoiceBox();
        CityId = new ChoiceBox();

    }

    /**
     * Functie suprascrisa a interfetei Initializable,in care se initializeaza datele de intrare din fisier
     * astfel incat,la deschiderea interfetei grafice,acestea sa fie deja incarcate.
     *
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String filename="src/ro/mta/se/lab/Resources/Cities.txt";
        MyFileReader.ReadSetData(filename);
        MyFileReader.setSelectBox(CountryId,CityId);
    }

    /**
     * Acesta functie este apelata la fiecare apasare a butonului Weather din interfata grafica
     * In acesta se primeste raspunsul serverului la cererea facuta pentru detalii despre orasul selectat
     * se scrie in fisierul cu istoric acesta operatie si se initializeaza un AlertBox in care se afiseaza
     * detaliile despre vremea in orasul respectiv.
     */

    public void onPressWeatherButton() throws ParseException, IOException {
        String response;
        String City = (String) CityId.getValue();
        WeatherAPI.setConnection(City, "metric", "en");
        String fileout="src/ro/mta/se/lab/Resources/WeatherHistory.txt";
        response = WeatherAPI.getResponse();
        History.writeSerchResult(fileout,response,City);
        CityWeather = new CityWeather();
        CityWeather.setParameters(response);
        String title = City + " Weather";
        String exitmsg="I hope it helped. Have a nice day!";
        AlertBox alert=new AlertBox();
        alert.displayWeather(title,CityWeather.display(),exitmsg);
    }

}
