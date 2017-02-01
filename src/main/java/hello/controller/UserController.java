package hello.controller;

import hello.model.UserProfile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Malac on 2/1/2017.
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public UserProfile getMeUsers(@RequestParam(value="studentID", defaultValue="") int studentID) {
        UserProfile user = null;
        switch(studentID) {
            case 555127:
                user = new UserProfile("Joe", "joseph.malachosky@stu.laroche.edu");
                break;
            case 555999:
                user = new UserProfile("Jack", "jack.example@stu.laroche.edu");
                break;
        }
        return user;
    }
}
