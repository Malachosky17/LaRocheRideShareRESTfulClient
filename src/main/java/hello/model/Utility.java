package hello.model;

import javax.persistence.*;

/**
 * Created by Malac on 1/25/2017.
 */
@Entity
@Table(name = "Utilities")
public class Utility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private long utilityid;
    @Column(nullable = false)
    private String utilityName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;


    private final String name;

    public Utility(double latitude, double longitude, String name) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double[] getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
