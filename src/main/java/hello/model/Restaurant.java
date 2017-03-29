package hello.model;


import javax.persistence.*;

@Entity
@Table(name = "Restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long restaurantId;
    @Column(nullable = false)
    private String restaurantName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;


    public Restaurant(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.restaurantName = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getShoppingName() {
        return restaurantName;
    }

    public void setShoppingName(String shoppingName) {
        this.restaurantName = shoppingName;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long shoppingId) {
        this.restaurantId = shoppingId;
    }
}
