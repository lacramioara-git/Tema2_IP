package ro.mta.se.lab.Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CityWeather {
    private double temperature;
    private double feels_like;
    private double pressure;
    private double humidity;
    private double wind;
    private String description;
    private String CityName;
    private String CountryCode;

    public String getMainState() {
        return mainState;
    }

    private String mainState;

    public String getCityName() {
        return CityName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWind() {
        return wind;
    }

    public String getDescription() {
        return description;
    }

    public void setParameters(String response) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(response);
        JSONObject mainOb= (JSONObject) json.get("main");
        this.temperature= Double.parseDouble(String.valueOf(mainOb.get("temp")));
        this.feels_like= Double.parseDouble(String.valueOf(mainOb.get("feels_like")));
        this.pressure= Double.parseDouble(String.valueOf(mainOb.get("pressure")));
        this.humidity= Double.parseDouble(String.valueOf(mainOb.get("humidity")));
        JSONObject windOb= (JSONObject) json.get("wind");
        this.wind= Double.parseDouble(String.valueOf(windOb.get("speed")));
        JSONArray weatherArr= (JSONArray) json.get("weather");
        JSONObject weatherob= (JSONObject) weatherArr.get(0);
        this.mainState= (String) weatherob.get("main");
        this.description= (String) weatherob.get("description");

        this.CityName= (String) json.get("name");
        JSONObject CounOb= (JSONObject) json.get("sys");
        this.CountryCode= (String) CounOb.get("country");


    }

    public String display()
    {
        String display="City: " + this.CityName + " , " + this.CountryCode + "\n"+
                        "Weather: " + this.description + "\n" +
                        "Ski: " + this.mainState + "\n" +
                        "Temerature: " + this.temperature + "\n" +
                        "Feels_like: " + this.feels_like + "\n" +
                        "Pressure: " + this.pressure + "\n" +
                        "Humidity: " + this.humidity + "\n" +
                        "Wind: " +this.wind + "\n";
        return display;
    }



}
