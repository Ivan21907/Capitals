package cat.dam.ivan.capitals;

public class Country
{
    // Atributs de la classe
    private String name;
    private String code;
    private String capital;
    private int imageResourceID;
    private double latitude;
    private double longitude;

    // Constructor de la classe
    public Country(String name, String code, String capital, int imageResourceID, double latitude, double longitude) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.imageResourceID = imageResourceID;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters i setters

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCapital() {
        return capital;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}