package hello.model;

/**
 * Created by Malac on 2/1/2017.
 */
public class UserProfile {

    private String firstName;
    private String emailAddress;


    public UserProfile(String name, String email) {
        setFirstName(name);
        setEmailAddress(email);
        this.emailAddress = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }
}
