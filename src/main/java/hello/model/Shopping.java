package hello.model;

/**
 * Created by Jumanie on 2/8/2017.
 */

public class Shopping {

    private final String name;
    private final double location[] = new double[2];

        public Shopping(double latitude, double longitude, String name) {
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

