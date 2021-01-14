package ro.mta.se.lab.Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * Acesta interfata este folosita pentru afisarea detaliilor legate de vreme pe o unitate.
 * La nivelul aplicatiei este folosita pentru a afisa datele legate de vremea
 * in orasul selectat(ar putea fi folosita pentru afisarea detaliilor vremii din tara,etc)
 *
 * @author Runcan Lacramioara
 */

public interface WeatherInfoInterface {
    public void setParameters(String ServerResponse) throws ParseException;
    public String display();

}
