package hello.controller;

import hello.model.Utility;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Malac on 1/25/2017.
 */

@RestController
public class UtilitiesController {

    private ArrayList<Utility> mUtilityList = new ArrayList<>();

    @RequestMapping("/locations/utilities")
    public ArrayList<Utility> getMeUtilities() {
        System.out.println("hit utilities");
        mUtilityList.clear();
        buildUtilityList();
        return mUtilityList;
    }

    private void buildUtilityList() {
        /*
         * Somehow need to show multiple of the same utilities AKA gas stations...
         * Return a list of gas stations instead of a single location...
         */
        mUtilityList.add(new Utility(40.557819, -80.023772, "Sunoco Gas"));
        mUtilityList.add(new Utility(40.572271, -80.036587, "Sunoco Gas 2"));
        mUtilityList.add(new Utility(90.0, 51.06, "Passavant Hospital"));
        mUtilityList.add(new Utility(40.545266, -80.016909, "GetGo Gas"));
    }
}