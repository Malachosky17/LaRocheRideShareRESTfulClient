package hello.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Restaurant;

@RestController
public class RestaurantController {

    private ArrayList<Restaurant> mRestaurantList = new ArrayList<>();

    @RequestMapping("/locations/restaurants")
    public ArrayList<Restaurant> getMeRestaurants() {
        System.out.println("hit restaurants");
        mRestaurantList.clear();
        getRestaurantList();
        return mRestaurantList;
    }

    private void getRestaurantList() {
        mRestaurantList.add(new Restaurant(40.585317, -80.038578, "J.Clark's"));
        mRestaurantList.add(new Restaurant(40.570432, -80.022487, "Trader joes"));
        mRestaurantList.add(new Restaurant(40.570142, -80.023067, "BJ’s Restaurant & Brewhouse"));
        mRestaurantList.add(new Restaurant(40.569697, -80.023064, "Bonefish Grill"));
        mRestaurantList.add(new Restaurant(40.571283, -80.022857, "Longhorn Steak House"));
        mRestaurantList.add(new Restaurant(40.570130, -80.021570, "Hello Bistro"));
        mRestaurantList.add(new Restaurant(40.571718, -80.022803, "First Watch"));
        mRestaurantList.add(new Restaurant(40.568570, -80.022399, "Panera Bread"));
        mRestaurantList.add(new Restaurant(40.570110, -80.020967, "Convive Coffee"));
        mRestaurantList.add(new Restaurant(40.570129, -80.020742, "Gigi’s Cupcakes"));
        mRestaurantList.add(new Restaurant(40.569747, -80.021604, "Burgatory"));
        mRestaurantList.add(new Restaurant(40.568840, -80.023364, "Chipotle"));
        mRestaurantList.add(new Restaurant(40.569427, -80.024365, "IHOP"));
        mRestaurantList.add(new Restaurant(40.569211, -80.024419, "DiBella’s Subs"));
        mRestaurantList.add(new Restaurant(40.569073, -80.025038, "Handel’s Homemade Ice Cream"));
        mRestaurantList.add(new Restaurant(40.575956, -80.026128, "Outback Steak house"));
        mRestaurantList.add(new Restaurant(40.584911, -80.037238, "Taco Bell/KFC "));
        mRestaurantList.add(new Restaurant(40.585348, -80.038436, "J. Clarks"));
        mRestaurantList.add(new Restaurant(40.553131, -80.019361, "Olive Garden"));
        mRestaurantList.add(new Restaurant(40.552242, -80.018919, "The Original Pancake House"));
        mRestaurantList.add(new Restaurant(40.549701, -80.019280, "Mad Mex"));
        mRestaurantList.add(new Restaurant(40.544793, -80.016047, "Eat’n Park"));
        mRestaurantList.add(new Restaurant(40.562565, -80.024733, "TGI Fridays"));
        mRestaurantList.add(new Restaurant(40.561476, -80.024622, "Empire Palace"));
        mRestaurantList.add(new Restaurant(40.567303, -80.000116, "Blue North Restaurant"));
        mRestaurantList.add(new Restaurant(40.566170, -79.998191, "Bellisario's"));
        mRestaurantList.add(new Restaurant(40.547513, -80.018515, "Taj Mahal"));
        mRestaurantList.add(new Restaurant(40.572018, -80.037315, "Bistro 9101"));
        mRestaurantList.add(new Restaurant(40.542045, -80.010538, "The Cheesecake Factory"));
        mRestaurantList.add(new Restaurant(40.546672, -80.019432, "Sesame Inn Chinese Restaurant"));
        mRestaurantList.add(new Restaurant(40.605293, -80.006013, "OTB Bicycle Cafe"));
        mRestaurantList.add(new Restaurant(40.544898, -79.972638, "Le Thai Cafe"));
        mRestaurantList.add(new Restaurant(40.517460, -80.004968, "Red Lobster"));

    }

}
