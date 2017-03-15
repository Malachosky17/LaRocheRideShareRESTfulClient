package hello.model;

import javax.persistence.*;

/**
 * Created by Malac on 2/1/2017.
 */
@Entity
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String fullName;
    private String emailAddress;

    public UserProfile() {}

    public UserProfile(String name, String email) {
        setFullName(name);
        setEmailAddress(email);
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
