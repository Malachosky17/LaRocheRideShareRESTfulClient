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

//    @RequestMapping("/utilities")
//    public Utility restaurant(@RequestParam(value="name", defaultValue="") String name) {
//        /*
//         * Somehow need to show multiple of the same utilities AKA gas stations...
//         * Return a list of gas stations instead of a single location...
//         */
//        buildUtilityList();
//        Utility utility = null;
//        switch(name) {
//            case "Sunoco Gas":
//                utility = mUtilityList.get(0);
//                break;
//            case "Passavant Hospital":
//                utility = mUtilityList.get(1);
//                break;
//        }
//        return utility;
//    }

    @RequestMapping("/utilities")
    public ArrayList<Utility> getMeUtilities() {
        /*
         * Somehow need to show multiple of the same utilities AKA gas stations...
         * Return a list of gas stations instead of a single location...
         */
        buildUtilityList();
//        Utility utility = null;
//        switch(name) {
//            case "Sunoco Gas":
//                utility = mUtilityList.get(0);
//                break;
//            case "Passavant Hospital":
//                utility = mUtilityList.get(1);
//                break;
//        }
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
    }
}