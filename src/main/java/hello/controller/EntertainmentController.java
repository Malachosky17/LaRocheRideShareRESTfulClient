package hello.controller;

import hello.model.Entertainment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Malac on 1/25/2017.
 */

@RestController
public class EntertainmentController {

    private ArrayList<Entertainment> mEntertainmentList = new ArrayList<>();

    @RequestMapping("/entertainment")
    public ArrayList<Entertainment> getMeEntertainment() {
        mEntertainmentList.clear();
        getEntertainmentList();
        return mEntertainmentList;
    }

    private void getEntertainmentList() {
        mEntertainmentList.add(new Entertainment(40.570512, -80.019685, "Cinemark North Hills and XD"));
        mEntertainmentList.add(new Entertainment(40.546806, -80.018068, "Laser Storm Pittsburgh"));
    }
}