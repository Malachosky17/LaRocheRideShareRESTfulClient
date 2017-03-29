package hello.model;


import javax.persistence.*;

@Entity
@Table(name = "Restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private long restaurantid;
    @Column(nullable = false)
    private String restaurantName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;


    private final String name;

    public Restaurant(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public double[] getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
