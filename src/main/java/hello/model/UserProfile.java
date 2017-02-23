package hello.model;

/**
 * Created by Malac on 2/1/2017.
 */
public class UserProfile {

    private String fullName;
    private String emailAddress;

    public UserProfile() {}

    public UserProfile(String name, String email) {
        setFullName(name);
        setEmailAddress(email);
        this.emailAddress = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }
}
