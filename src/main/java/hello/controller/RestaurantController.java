package hello.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.model.Restaurant;

@RestController
public class RestaurantController {

    private ArrayList<Restaurant> mRestaurantList = new ArrayList<>();

    @RequestMapping("/restaurants")
    public ArrayList<Restaurant> getMeRestaurants() {
        mRestaurantList.clear();
        getRestaurantList();
        return mRestaurantList;
    }

    private void getRestaurantList() {
        mRestaurantList.add(new Restaurant(40.570158, -80.023099, "BJ's Restaurant and Brewhouse"));
        mRestaurantList.add(new Restaurant(40.585317, -80.038578, "J.Clark's"));
        mRestaurantList.add(new Restaurant(40.570432, -80.022487, "Trader joes"));
        mRestaurantList.add(new Restaurant(40.570123, -80.022864 , "BJ’s Restaurant & Brewhouse"));
        mRestaurantList.add(new Restaurant(40.569697, -80.023064, "Bonefish Grill"));
        mRestaurantList.add(new Restaurant(40.571283, -80.022857, "Longhorn Steak House"));
        mRestaurantList.add(new Restaurant(40.570130, -80.021570, "Hello Bistro"));
        mRestaurantList.add(new Restaurant(40.571718, -80.022803, "First Watch"));
        mRestaurantList.add(new Restaurant(40.568570, -80.022399, "Panera Bread"));
        mRestaurantList.add(new Restaurant(40.570110, -80.020967, "Convive Coffee"));
        mRestaurantList.add(new Restaurant(40.570129, -80.020742, "Gigi’s Cupcakes"));
        mRestaurantList.add(new Restaurant(40.569747, -80.021604, "Burgatory"));


    }

}
