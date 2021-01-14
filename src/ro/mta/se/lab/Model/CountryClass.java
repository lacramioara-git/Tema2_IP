package ro.mta.se.lab.Model;

import java.util.ArrayList;
/**
 * Acesta clasa este implementata pentru a retine la nivelul fiecarei tari,o lista de orase si codul
 * tarii respective
 *
 * @author Runcan Lacramioara
 */


public class CountryClass {
    /**
     * @param CityList lista de orase din interiorul tarii
     * @param CountryCode codul reprezentativ al tarii
     */

    private ArrayList<CityClass> CityList;
    private String CountryCode;

    /**
     * Acesta clasa contine metode de tipul setter si getter a membrilor,
     * constructor si o metoda de adaugare in lista de orase
     */

    public CountryClass() {
        CityList = new ArrayList<CityClass>();

    }

    public ArrayList<CityClass> getCityList() {
        return CityList;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void addCity(CityClass City)
    {
           this.CityList.add(City);
    }

    public void setCountryCode(String countryCode) {
        this.CountryCode = countryCode;
    }
}
