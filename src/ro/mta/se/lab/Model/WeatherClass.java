package ro.mta.se.lab.Model;

import java.util.ArrayList;

public class WeatherClass {
    private ArrayList<CountryClass> CountryList;

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
