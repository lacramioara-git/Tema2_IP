package ro.mta.se.lab.Test;
import org.junit.Before;
import org.junit.Test;
import ro.mta.se.lab.Model.CityClass;
import ro.mta.se.lab.Model.CountryClass;
import ro.mta.se.lab.Model.WeatherClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestWeather {

    private CountryClass Country;
    private WeatherClass Weather;
    @Before
    public void setUp()
    {
        Weather=new WeatherClass();
        Country=mock(CountryClass.class);
    }

    @Test
    public void  testAddCountry()
    {
        when(Country.getCountryCode()).thenReturn("CountryTest");
        Weather.addCountry(Country);

        for(int i=0;i<Weather.getCountryList().size();i++) {
            assertNotNull(Weather.getCountryList().get(i).getCountryCode());
            assertEquals(Country.getCountryCode(),Weather.getCountryList().get(i).getCountryCode());
        }
    }

}

