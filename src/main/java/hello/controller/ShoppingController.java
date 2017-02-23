package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import hello.model.Shopping;

/**
 * Created by Jumanie on 2/8/2017.
 */
@RestController
public class ShoppingController {
    private ArrayList<Shopping> mShoppingList = new ArrayList<>();

    @RequestMapping("/locations/shopping")
    public ArrayList<Shopping> getMeShopping() {
        mShoppingList.clear();
        getShoppingList();
        return mShoppingList;
    }

    private void getShoppingList() {
        mShoppingList.add(new Shopping(40.570432, -80.022487, "Trader Joes"));
        mShoppingList.add(new Shopping(40.555812, -80.018676, "Fine Wine and Good Spirits"));
        mShoppingList.add(new Shopping(40.584593, -80.037841, "Giant Eagle"));
        mShoppingList.add(new Shopping(40.555389, -80.018323, "Giant Eagle"));
        mShoppingList.add(new Shopping(40.550927, -80.022525, "ALDI"));
        mShoppingList.add(new Shopping(40.569560, -80.022111, "Old Navy"));
        mShoppingList.add(new Shopping(40.569444, -80.020152, "Dick's Sporting Goods"));
        mShoppingList.add(new Shopping(40.568993, -80.020126 , "Home Goods"));
        mShoppingList.add(new Shopping(40.570100, -80.021214 , "Gifted Hands"));
        mShoppingList.add(new Shopping(40.570546, -80.025021 , "Lowe's"));
        mShoppingList.add(new Shopping(40.584731, -80.039046 , "GNC"));
        mShoppingList.add(new Shopping(40.585134, -80.040244 , "Target"));
        mShoppingList.add(new Shopping(40.555095, -80.019364 , "Dunham's Sports"));
        mShoppingList.add(new Shopping(40.554057, -80.016515 , "Gabriel Brothers"));
        mShoppingList.add(new Shopping(40.552834, -80.015588 , "Office Max"));
        mShoppingList.add(new Shopping(40.551521, -80.020495 , "Northway Mall"));
        mShoppingList.add(new Shopping(40.544865, -80.011548 , "The Home Depot"));
        mShoppingList.add(new Shopping(40.544896, -80.007452 , "Ross Park Mall"));


    }
}

