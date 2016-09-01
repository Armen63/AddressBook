import java.util.*;

/**
 * Created by Armen on 8/28/2016.
 */
public class User {
    private String username;
    private String password;
    private static int userId = 0;
    List<Number> phoneNumber = new ArrayList<>();
   static TreeMap<String,String> friendList = new TreeMap<>();

    public User(){}
    public User(String userName, String password){
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  userId + " " + this.getUsername() + " " + this.getPassword();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass())
            return false;

        User user = (User) ob;

        return username != null ? username.equals(user.username) : user.username == null
                && (password != null ? password.equals(user.password) : user.password == null);

    }



}
