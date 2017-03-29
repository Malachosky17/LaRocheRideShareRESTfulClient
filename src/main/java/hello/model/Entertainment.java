package hello.model;

import javax.persistence.*;

/**
 * Created by Malac on 1/25/2017.
 */

@Entity
@Table(name = "Entertainment")
public class Entertainment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private long entertainmentid;
    @Column(nullable = false)
    private String entertainmentName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;



    private final String name;

    public Entertainment(double latitude, double longitude, String name) {
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
