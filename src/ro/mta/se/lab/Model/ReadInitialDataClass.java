package ro.mta.se.lab.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

import java.io.*;
import java.util.ArrayList;

public class ReadInitialDataClass {
    private CountryClass Country;
    private CityClass City;
    private  WeatherClass Weather;

    public ReadInitialDataClass() {
        Weather = new WeatherClass();
    }

    public CityClass getCity() {
        return City;
    }

    public CountryClass getCountry() {
        return Country;
    }

    public WeatherClass getWeather() {
        return Weather;
    }

    public void ReadSetData(String filename) {
        try {
            File myfile = new File(filename);
            BufferedReader myReader;
            myReader = new BufferedReader(new FileReader(myfile));
            String data = myReader.readLine();
            data = myReader.readLine();
            while (data != null) {
                String[] dataArray = data.split("\\|");
                int i = 0;
                City = new CityClass();
                City.setCityId(Integer.parseInt(dataArray[i]));
                i++;
                City.setCityName(dataArray[i]);
                i++;
                City.setLat(Float.parseFloat(dataArray[i]));
                i++;
                City.setLon(Float.parseFloat(dataArray[i]));
                i++;
                City.setCountryCode(dataArray[i]);
                int ok = 1;
                for (int k = 0; k < Weather.getCountryList().size(); k++) {
                    if (City.getCountryCode().equals(Weather.getCountryList().get(k).getCountryCode())) {
                        Weather.getCountryList().get(k).addCity(City);
                        ok = 0;
                        break;
                    }
                }
                if (ok == 1) {
                    Country = new CountryClass();
                    Country.addCity(City);
                    Country.setCountryCode(dataArray[i]);
                    Weather.addCountry(Country);
                }


                data = myReader.readLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Eroare la citirea datelor din fisierul de intrare.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setSelectBox(ChoiceBox CountryId,ChoiceBox CityId)
    {

        for(int i=0;i<Weather.getCountryList().size();i++) {
            CountryId.getItems().add(Weather.getCountryList().get(i).getCountryCode());
        }

        CountryId.getSelectionModel().selectedIndexProperty().addListener((v, oldValue, newValue)->
                {
                    CityId.getItems().clear();
                    int index = (int)newValue;
                    ArrayList<CityClass> Cities =new ArrayList<CityClass>();
                    Cities.addAll(Weather.getCountryList().get(index).getCityList());
                    ObservableList<String> CityList = FXCollections.observableArrayList();
                    for(int i=0;i<Cities.size();i++)
                    {
                        CityList.add(Cities.get(i).getCityName());
                    }
                    CityId.getItems().addAll(CityList);
                }
        );

    }
}
