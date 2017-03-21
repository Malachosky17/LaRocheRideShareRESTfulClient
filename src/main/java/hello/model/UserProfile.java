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
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String emailAddress;

    public UserProfile() {}

    public UserProfile(long id) {
        this.userId = id;
    }

    public UserProfile(String name, String email) {
        setFullName(name);
        setEmailAddress(email);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long id) {
        this.userId = id;
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
