import java.util.Objects;

public class City {

    private int id_city;
    private double longitude,latitude;
    private String name;

    public City(int id_city, String name, double longitude, double latitude) {
        this.id_city = id_city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.name = name;
    }

    public int getId_city() {
        return id_city;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString(){
        return id_city + " / " + name + " / " + longitude + " / " + latitude;
    }
}
