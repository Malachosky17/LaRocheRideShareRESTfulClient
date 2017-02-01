package hello.controller;

import hello.model.Entertainment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Malac on 1/25/2017.
 */

@RestController
public class EntertainmentController {

    private ArrayList<Entertainment> mEntertainmentList = new ArrayList<>();

//    @RequestMapping("/entertainment")
//    public Entertainment restaurant(@RequestParam(value="name", defaultValue="") String name) {
//        getEntertainmentList();
//        Entertainment playPlace = null;
//        switch(name) {
//            case "Cinemark North Hills and XD":
//                playPlace = mEntertainmentList.get(0);
//                break;
//            case "Laser Storm Pittsburgh":
//                playPlace = mEntertainmentList.get(1);
//                break;
//        }
//        return playPlace;
//    }

    @RequestMapping("/entertainment")
    public ArrayList<Entertainment> getMeEntertainmentHotspots() {
        getEntertainmentList();
//        Entertainment playPlace = null;
//        switch(name) {
//            case "Cinemark North Hills and XD":
//                playPlace = mEntertainmentList.get(0);
//                break;
//            case "Laser Storm Pittsburgh":
//                playPlace = mEntertainmentList.get(1);
//                break;
//        }
        return mEntertainmentList;
    }

    private void getEntertainmentList() {
        mEntertainmentList.add(new Entertainment(40.570512, -80.019685, "Cinemark North Hills and XD"));
        mEntertainmentList.add(new Entertainment(40.546806, -80.018068, "Laser Storm Pittsburgh"));
    }
}
