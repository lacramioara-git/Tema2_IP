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

/**
 * Acesta clasa este implementata pentru a testa corectitudinea functionarii aplicatiei
 * Se testeaza corectitudinea in momentul adaugarii tarilor in lista de la nivelul clasei WeatherClass.
 *
 * @author Runcan Lacramioara
 */
public class TestWeather {

    private CountryClass Country;
    private WeatherClass Weather;
    /**
     * Acesta metoda este implementata pentru a crea un obiect mock pentru Clasa CountryClass
     */

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

