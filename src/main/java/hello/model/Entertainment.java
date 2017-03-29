package hello.model;

import javax.persistence.*;

/**
 * Created by Malac on 1/25/2017.
 */

@Entity
@Table(name = "entertainment")
public class Entertainment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long entertainmentId;
    @Column(nullable = false)
    private String entertainmentName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;


    public Entertainment(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.entertainmentName = name;
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

    public String getEntertainmentName() {
        return entertainmentName;
    }

    public void setEntertainmentName(String entertainmentName) {
        this.entertainmentName = entertainmentName;
    }

    public long getEntertainmentId() {
        return entertainmentId;
    }

    public void setEntertainmentId(long entertainmentId) {
        this.entertainmentId = entertainmentId;
    }
}
