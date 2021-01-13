package ro.mta.se.lab.Test;

import org.junit.Test;
import ro.mta.se.lab.Model.WeatherAPIClass;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestWeatherAPI {

    @Test
    public void testServerResponse() throws IOException {
        WeatherAPIClass Weather=new WeatherAPIClass();
        Weather.setConnection("Paris","metric","en");
        assertNotNull(Weather.getResponse());
    }
/*
//Acest test trece doar ca depinde de timp.Valoare temperaturii si alte campuri se modifica in timp
    @Test
    public void testCorectResponse() throws IOException {
        WeatherAPIClass Weather=new WeatherAPIClass();
        Weather.setConnection("Paris","metric","en");
        String expected= "{\"coord\":{\"lon\":2.3488,\"lat\":48.8534},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\"base\":\"stations\",\"main\":{\"temp\":4.52,\"feels_like\":-0.83,\"temp_min\":3.89,\"temp_max\":6,\"pressure\":1021,\"humidity\":81},\"visibility\":10000,\"wind\":{\"speed\":5.14,\"deg\":240},\"clouds\":{\"all\":90},\"dt\":1610397244,\"sys\":{\"type\":1,\"id\":6550,\"country\":\"FR\",\"sunrise\":1610350864,\"sunset\":1610381737},\"timezone\":3600,\"id\":2988507,\"name\":\"Paris\",\"cod\":200}";
        assertEquals(Weather.getResponse(),expected);
    }
*/

    @Test
    public void testRequest() throws IOException {
        WeatherAPIClass Weather=new WeatherAPIClass();
        Weather.setConnection("Paris","metric","en");
        assertNotNull(Weather.getUrl());
    }

    @Test
    public void testKey() throws IOException {
        WeatherAPIClass Weather=new WeatherAPIClass();
        Weather.setConnection("Paris","metric","en");
        assertNotNull(Weather.getKey());
        String key="3d50b284adb0f5b101a2499c468375d7";
        assertEquals(Weather.getKey(),key);
    }
}
