package ro.mta.se.lab.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherAPIClass {
    private String key;
    private String response;
    private String Url;

    public String getResponse() {
        return response;
    }

    public WeatherAPIClass() {
        this.key = "3d50b284adb0f5b101a2499c468375d7";
        this.Url="http://api.openweathermap.org/data/2.5/weather?";
        this.response=null;
    }

    //url http://api.openweathermap.org/data/2.5/weather?q=London&units=metric&lang=ro&appid=3d50b284adb0f5b101a2499c468375d7
    public void setConnection(String CityName,String units,String lang) throws IOException {
        URL url = new URL(this.Url + "q=" + CityName + "&" + "units=" + units + "&" + "lang=" + lang + "&" + "appid=" + this.key);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer json = new StringBuffer(1024);
        String tmp = "";

        while((tmp = reader.readLine()) != null)
            json.append(tmp).append("\n");
        reader.close();
        this.response = json.toString();

        }
    }

