package hello.controller;

import hello.model.UserProfile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

/**
 * Created by Malac on 2/1/2017.
 */
@RestController
public class UserController {

    @RequestMapping(value="/user", method = RequestMethod.POST)
    public ResponseEntity<UserProfile> update(@RequestBody UserProfile profile) {
        System.out.println(String.format(Locale.ENGLISH, "FirstName: %s     Email: %s", profile.getFirstName(), profile.getEmailAddress()));
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }


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
