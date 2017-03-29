package hello.model;

import javax.persistence.*;

/**
 * Created by Jumanie on 2/8/2017.
 */

@Entity
@Table(name = "Shopping")
public class Shopping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO);
    private long shoppingid;
    @Column(nullable = false)
    private String shoppingName;
    @Column(nullable = false)
    private double longitude;
    @Column(nullable = false)
    private double latitude;

    private final String name;

        public Shopping(double latitude, double longitude, String name) {
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

