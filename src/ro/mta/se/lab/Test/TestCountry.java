package ro.mta.se.lab.Test;
import org.junit.Before;
import org.junit.Test;
import ro.mta.se.lab.Model.CityClass;
import ro.mta.se.lab.Model.CountryClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Acesta clasa este implementata pentru a testa corectitudinea functionarii aplicatiei
 * Se testeaza corectitudinea in momentul adaugarii oraselor in lista de la nivelul clasei CountryClass.
 *
 * @author Runcan Lacramioara
 */

public class TestCountry {

    private CountryClass Country;
    private CityClass City;
    /**
     * Acesta metoda este implementata pentru a crea un obiect mock pentru Clasa CityClass
     */

    @Before
    public void setUp()
    {
        Country=new CountryClass();
        City=mock(CityClass.class);
    }

    @Test
    public void  testAddCity()
    {
        when(City.getCityName()).thenReturn("TestCity");
        Country.setCountryCode(City.getCountryCode());
        Country.addCity(City);
        for(int i=0;i<Country.getCityList().size();i++) {
            assertEquals(Country.getCityList().get(i).getCityName(), City.getCityName());
        }
    }

    @Test
    public void testCountryCode()
    {
        when(City.getCountryCode()).thenReturn("Code");
        Country.setCountryCode(City.getCountryCode());
        Country.addCity(City);
        for(int i=0;i<Country.getCityList().size();i++) {
            assertEquals(Country.getCityList().get(i).getCountryCode(), City.getCountryCode());
            assertNotNull(Country.getCityList().get(i).getCountryCode());
        }
        assertNotNull(Country.getCountryCode());
    }
}

