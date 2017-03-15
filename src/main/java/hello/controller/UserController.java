package hello.controller;

import hello.dao.UserDao;
import hello.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

/**
 * Created by Malac on 2/1/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    //ControllerAdvice used to handle exceptions through controllers

    @RequestMapping(value="/admin/newUser", method = RequestMethod.POST)
    public ResponseEntity<UserProfile> update(@RequestBody UserProfile profile) {
        System.out.println(String.format(Locale.ENGLISH, "FullName: %s     Email: %s", profile.getFullName(), profile.getEmailAddress()));
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @RequestMapping(value="/user/**")
    public ResponseEntity<String> badUserRequest() {
        return new ResponseEntity<>("Denied URL Request", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value="/admin/**")
    public ResponseEntity<String> badAdminRequest() {
        return new ResponseEntity<>("Denied URL Request", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping("/user")
    public UserProfile getMeUsers(@RequestParam(value="studentID", defaultValue="0") int studentID) {
        UserProfile user = null;
//        switch(studentID) {
//            case 555127:
//                user = new UserProfile("Joe", "joseph.malachosky@stu.laroche.edu");
//                break;
//            case 555999:
//                user = new UserProfile("Jack", "jack.example@stu.laroche.edu");
//                break;
//        }
        user = new UserProfile("Joe", "joe.shmoe@go.com");

        return userDao.save(user);
    }
}
