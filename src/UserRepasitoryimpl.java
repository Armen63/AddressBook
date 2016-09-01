import java.util.*;

/**
 * Created by Armen on 8/29/2016.
 */
public class UserRepasitoryimpl implements UserRepository {


    @Override
    public User creatUser(User user) {

        Scanner input = new Scanner(System.in);
        System.out.print(">> Please provide your username:");
        user.setUsername(input.nextLine());
        System.out.println(">> Please provide your password:");
        user.setPassword(input.nextLine());
        return user;
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(Integer id) {
        User user = new User();
        boolean result = true;
        Scanner inputName = new Scanner(System.in);
        System.out.println(">> Pleaes provide your friend username");
        String name = inputName.nextLine();
        while(result){
            if(!name.equals(user.friendList.values()))
                result = false;
        }
        System.out.println(">>Thank you. Now Garnik and you are not friends.");
        return null;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }
}
