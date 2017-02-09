package hello.model;

/**
 * Created by Malac on 1/25/2017.
 */
public class Entertainment {

    private final String name;
    private final double location[] = new double[2];

    public Entertainment(double latitude, double longitude, String name) {
        this.location[0] = latitude;
        this.location[1] = longitude;
        this.name = name;
    }

    public double[] getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
