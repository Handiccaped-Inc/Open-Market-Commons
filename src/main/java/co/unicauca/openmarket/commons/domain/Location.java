package co.unicauca.openmarket.commons.domain;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
class Location {

    private int latitude;
    private int longitude;

    /**
     * Constructor of the class
     * 
     * @param latitude  latitude coordinates
     * @param longitude longitude coordinates
     */
    public Location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Default constructor of the class
     */
    public Location() {
    }

    /**
     * Returns the latitude
     * 
     * @return the latitude of the location
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude
     * 
     * @param latitude
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    /**
     * Returns the longitude
     * 
     * @return the longitude of the class
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude
     * 
     * @param longitude longitude of the location
     */
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

}
