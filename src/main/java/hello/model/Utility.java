package hello.model;

/**
 * Created by Malac on 1/25/2017.
 */
public class Utility {

    private final String name;
    private final double location[] = new double[2];

    public Utility(double longitude, double latitude, String name) {
        this.name = name;
        this.location[0] = latitude;
        this.location[1] = longitude;
    }

    public double[] getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
