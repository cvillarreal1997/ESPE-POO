
package ec.edu.espe.STPCSProject.model;

/**
 *
 * @author Jose
 * @version 1.0
 *
 */
public class Address//Clase lista para pruebas/Correcta en el Diagrama
{
    private String mainStreet;
    private String secondStreet;
    private String city;
    private String country;

    /**
     * @return the mainStreet
     */
    public String getMainStreet() {
        return mainStreet;
    }

    /**
     * @param mainStreet the mainStreet to set
     */
    public void setMainStreet(String mainStreet) {
        this.mainStreet = mainStreet;
    }

    /**
     * @return the secondStreet
     */
    public String getSecondStreet() {
        return secondStreet;
    }

    /**
     * @param secondStreet the secondStreet to set
     */
    public void setSecondStreet(String secondStreet) {
        this.secondStreet = secondStreet;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
/**
 * Constructor
 * @param mainStreet
 * @param secondStreet
 * @param city
 * @param country 
 * @since 0.1
 */
    public Address(String mainStreet, String secondStreet, String city, String country) {
        this.mainStreet = mainStreet;
        this.secondStreet = secondStreet;
        this.city = city;
        this.country = country;
    }

    
}
