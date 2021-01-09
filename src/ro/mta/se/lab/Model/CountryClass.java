package ro.mta.se.lab.Model;

import java.util.ArrayList;

public class CountryClass {
    private ArrayList<CityClass> CityList;
    private String CountryCode;

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
