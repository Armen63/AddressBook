/**
 * Created by Armen on 8/29/2016.
 */
public interface UserRepository {
    User creatUser(User user);
    User editUser(User user);
    User deleteUser(Integer id);
    User getUser(Integer id);

}
