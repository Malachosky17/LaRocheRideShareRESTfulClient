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
    }

}
