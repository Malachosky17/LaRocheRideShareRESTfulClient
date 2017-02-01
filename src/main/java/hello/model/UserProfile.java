package hello.model;

/**
 * Created by Malac on 2/1/2017.
 */
public class UserProfile {

    private final String mName;
    private final String mEmail;


    public UserProfile(String name, String email) {
        this.mName = name;
        this.mEmail = email;
    }

    public String getName() {
        return mName;
    }

    public String getEmail() {
        return mEmail;
    }
}
