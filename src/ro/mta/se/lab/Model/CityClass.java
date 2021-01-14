package ro.mta.se.lab.Model;
/**
 * Acesta clasa este implementata pentru a reprezenta un oras cu toate detaliile lui initiale.
 *
 * @author Runcan Lacramioara
 */


public class CityClass {
    /**
     * @param CityName - numele orasului
     * @param CityId - id ul orasului
     * @param lat- latitudinea orasului
     * @param lon -longitudinea orasului
     * @param CountryCode - codul tarii din care face parte
     *
     */

    private String CityName;
    private int CityId;
    private float lat;
    private float lon;
    private String CountryCode;

    /**
     * Acesta clasa contine metode de tip setter si getter pentru membrii acesteia
     *
     */

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
