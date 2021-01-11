package ro.mta.se.lab.Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public interface WeatherInfoInterface {
    public void setParameters(String ServerResponse) throws ParseException;
    public String display();

}
