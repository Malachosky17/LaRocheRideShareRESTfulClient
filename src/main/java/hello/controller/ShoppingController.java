package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import hello.model.Entertainment;
import hello.model.Shopping;

/**
 * Created by Jumanie on 2/8/2017.
 */
@RestController
public class ShoppingController {
    private ArrayList<Shopping> mShoppingList = new ArrayList<>();

    @RequestMapping("/shopping")
    public ArrayList<Shopping> getMeShopping() {
        mShoppingList.clear();
        getEntertainmentList();
        return mShoppingList;
    }

    private void getEntertainmentList() {
        mShoppingList.add(new Shopping(40.570432, -80.022487, "Trader Joes"));
        mShoppingList.add(new Shopping(40.555812, -80.018676, "Fine Wine and Good Spirits"));
        mShoppingList.add(new Shopping(40.584593, -80.037841, "Giant Eagle"));
        mShoppingList.add(new Shopping(40.555389, -80.018323, "Giant Eagle"));
        mShoppingList.add(new Shopping(40.550927, -80.022525, "ALDI"));

    }
}

