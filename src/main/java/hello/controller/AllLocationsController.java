package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Malac on 2/22/2017.
 */
@RestController
public class AllLocationsController {

    @RequestMapping(value="/locations/everything")
    public ArrayList<String> getAllLocations() {
        return buildLocations();
    }

    /*
     * This method will generate a list of all places where people can be found
     */
    private ArrayList<String> buildLocations() {
        ArrayList<String> allLocations = new ArrayList<>();
        return allLocations;
    }
}
