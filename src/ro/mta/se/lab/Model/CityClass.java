package ro.mta.se.lab.Model;

public class CityClass {
    private String CityName;
    private int CityId;
    private float lat;
    private float lon;
    private String CountryCode;

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public double setCountryCode(String countryCode) {
        CountryCode = countryCode;
        return 0;
    }

    public String getCityName() {
        return CityName;
    }

    public int getCityId() {
        return CityId;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }

    public String getCountryCode() {
        return CountryCode;
    }
}
