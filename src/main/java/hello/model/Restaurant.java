package hello.model;

public class Restaurant {

    private final String name;
    private final double location[] = new double[2];

    public Restaurant(double latitude, double longitude, String name) {
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
