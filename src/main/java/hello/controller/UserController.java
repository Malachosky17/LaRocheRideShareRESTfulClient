package hello.controller;

import hello.dao.UserDao;
import hello.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Malac on 2/1/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    private Pattern firstLastNamePattern = Pattern.compile("([a-zA-Z]+).([a-zA-Z]+).+");
    //ControllerAdvice used to handle exceptions through controllers

    @RequestMapping(value="/admin/updateUser")
    public String updateUser(@RequestParam(value="oldEmail", defaultValue="") String emailAddress) {
        try {
            UserProfile profile = userDao.findByEmailAddress(emailAddress);
            if(profile != null) {
                profile.setFullName(parseName(emailAddress));
                profile.setEmailAddress(emailAddress);
                userDao.save(profile);
            }
        } catch(Exception e) {
            return "Failed to update user: " + emailAddress;
        }
        return "Successfully updated user: " + emailAddress;
    }

    @RequestMapping(value = "/admin/createUser")
    public String createUser(@RequestParam(value = "emailAddress", defaultValue = "") String emailAddress) {
        //Check if the user exists before adding them to MySQL.
        UserProfile profile = getUserByEmail(emailAddress);
        if(profile == null) {
            try {
                profile = new UserProfile(parseName(emailAddress), emailAddress);
                userDao.save(profile);
            } catch(Exception e) {
                return "Error in creating: " + emailAddress;
            }
            return String.format("Successfully created: (id=%d, email=%s)", profile.getUserId(), profile.getEmailAddress());
        }
        return "User already exists!";
    }

    @RequestMapping(value = "/admin/deleteUser")
    public String delete(@RequestParam(value = "emailAddress", defaultValue = "")String email) {
        UserProfile profile;
        try {
            profile = userDao.findByEmailAddress(email);
            if(profile != null) {
                userDao.delete(profile);
                System.out.println("Found user: " + email);
                return String.format("%s was successfully deleted.", profile.getEmailAddress());
            }
        } catch(Exception e) {
            return "Error deleting the user: " + e.toString();
        }
        return "Error deleting the user: " + email;
    }

    @RequestMapping("/user")
    public UserProfile getUserByEmail(@RequestParam(value="emailAddress", defaultValue="")String emailAddress) {
        UserProfile profile = null;
        try {
            profile = userDao.findByEmailAddress(emailAddress);
            System.out.println("Found the user: " + emailAddress);
        } catch(Exception e) {
            System.out.println("Failed to find user: " + emailAddress);
        }
        return profile;
    }

    private String parseName(String email) {
        Matcher matcher = firstLastNamePattern.matcher(email);
        if(matcher.find()) {
            System.out.println(matcher.group(1) + " " + matcher.group(2));
            return matcher.group(1) + " " + matcher.group(2);
        }
        return null;
    }
}
