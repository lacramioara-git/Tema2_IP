package ro.mta.se.lab.Model;

import java.util.ArrayList;

/**
 * Acesta clasa este implementata pentru a retine lista de tari disponibile la
 * nivelul apicatiei
 *
 * @author Runcan Lacramioara
 */


public class WeatherClass {
    private ArrayList<CountryClass> CountryList;
    /**
     * Acesta clasa contine metode de tip getter,setter pentru lista de tari ,dar si o metoda de adaugare a tarilor in lista
     *
     * @author Runcan Lacramioara
     */

    public WeatherClass() {
        this.CountryList = new ArrayList<CountryClass>();
    }

    public ArrayList<CountryClass> getCountryList() {
        return CountryList;
    }


    public void setCountryList(ArrayList<CountryClass> countryList) {
        CountryList = countryList;
    }

    public void addCountry(CountryClass Country) {

        this.CountryList.add(Country);

    }

}
