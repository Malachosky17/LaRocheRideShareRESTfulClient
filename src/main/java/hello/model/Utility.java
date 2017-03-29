package hello.model;

import javax.persistence.*;

/**
 * Created by Malac on 1/25/2017.
 */
@Entity
@Table(name = "utilities")
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long utilityId;
    @Column(nullable = false)
    private String utilityName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;


    public Utility(double latitude, double longitude, String name) {
        this.utilityName = name;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getUtilityName() {
        return utilityName;
    }

    public void setUtilityName(String shoppingName) {
        this.utilityName = shoppingName;
    }

    public long getUtilityId() {
        return utilityId;
    }

    public void setUtilityId(long shoppingId) {
        this.utilityId = shoppingId;
    }
}
