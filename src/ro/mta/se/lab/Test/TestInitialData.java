package ro.mta.se.lab.Test;

import org.junit.Test;
import ro.mta.se.lab.Model.CityClass;
import ro.mta.se.lab.Model.ReadInitialDataClass;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestInitialData {

    @Test
    public void testInData() throws IOException {
        ReadInitialDataClass reader=new ReadInitialDataClass();
        reader.ReadSetData("src/ro/mta/se/lab/Resources/Cities.txt");
        CityClass City=new CityClass();
        City.setCityName("Paris");
        City.setCityId(1);
        City.setCountryCode("FR");
        City.setLat((float) 48.8566);
        City.setLon((float) 2.3522);
        int ok1=0;
        int ok2=0;
        for(int i=0;i<reader.getWeather().getCountryList().size();i++) {
            if(City.getCountryCode().equals(reader.getWeather().getCountryList().get(i).getCountryCode()))
            {
                ok1=i;
                for(int j=0;j<reader.getWeather().getCountryList().get(i).getCityList().size();j++) {
                    if (City.getCityName().equals(reader.getWeather().getCountryList().get(i).getCityList().get(j).getCityName()))
                    {
                        ok2 = j;
                        break;
                    }
                }
            }
        }

        assertEquals(City.getCityName(),reader.getWeather().getCountryList().get(ok1).getCityList().get(ok2).getCityName());
    }
}