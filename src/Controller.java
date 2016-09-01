import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Armen on 8/31/2016.
 */
public class Controller {
    /*public UserRepository userRep = new UserRepositoryimpl() {//UserRepository  obyekt@ sarqeci ira methodner@ avtomat override exan et normala ?
        @Override
        public User creatUser(User user) {
            return null;
        }

        @Override
        public User editUser(User user) {
            return null;
        }

        @Override
        public User deleteUser(Integer id) {
            return null;
        }

        @Override
        public User getUser(Integer id) {
            return null;
        }
    };*/

  static   List<User> userList = new ArrayList<User>(); // meke es list@ vor@ globala nerqev@ funkcainerum ogtagorcum em ch toxum

    static User urishUser;
    int count = 0;

    public static void Validation() {
        File file = new File("text.txt");
        Scanner scan = new Scanner(System.in);

        InputStream input = null;
        try {
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            //input = new FileInputStream("C:\\Users\\Armen\\IdeaProjects\\AddressBook2\\text.txt");
            System.out.println("Please write down one of this commands 'Sign In' or 'Sign Up'.");
            String commandName = scan.nextLine();
            while (true) {
                switch (commandName) {
                    case ("Sign Up"):
                        signUp();
                        break;
                    case ("Sign In"):
                        signIn();
                        break;
                    case ("Sign Out"):
                        Validation();
                        break;
                    case ("Exit"):
                        System.exit(0);
                        break;
                    case ("Help"):
                        help();
                        break;
                    case ("Add"):
                        addTelNumber(urishUser);
                        break;
                    case ("Show"):
                        showTelNumber(urishUser);
                        break;
                    case ("add friend"):
                        addFriend();
                    case ("show friend"):
                        showFriendList();
                        break;
                    case ("delete friend"):
                        deleteFriend();
                        break;
                    default:
                        System.out.println("Your username or password is incorrect");
                        System.out.println(" Please write down one of this commands 'Sign In' or 'Sign Up'");
                }
                commandName = scan.nextLine();
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void signUp(){
        String username,
                password;
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide your username and password");
        username = input.nextLine();
        System.out.println("Please provide your password:");
        password = input.nextLine();
        User user = new User(username, password);
        userList.add(user); //                                                   <----------------
        System.out.println("You have successfully created user. Please write down one of this commands 'Sign In' or 'Sign Up'.");
    }

    public static void signIn(){
        boolean result = false;
        int count = 0;
        Scanner input = new Scanner(System.in);
        String username,
                password;
        System.out.println("Please provide your username:");
        username = input.nextLine();

        System.out.println("Please provide your password:");
        password = input.nextLine();

      User user = new User(username, password);
        for(User otherUser:userList){
            result = true;
            if(otherUser.equals(user)){
                ///////////////////////////////
                urishUser = otherUser;
                result = true;
                break;
            }
        }
        if(result){
            System.out.println(">>You are successfully logged in\n" +
                    ">>Now you can write down one of this commands 'Add Tel. Numb' or 'Show Tel. Numbers'");
        }
        else if(count < 3){
            System.out.println("Your username or password is incorrect");
            ++count;
            signIn(); //rec
        }
        else
            return;
    }

    public static void help(){
        System.out.println("If you want to register ,you need command 'Sign Up'\n"
                + "If you want to sign in ,you need command 'Sign In'\n"
                + "If you want to add tel number, you need command 'Add Tel. Number'\n"
                + "If you want to see all numbers, you need command 'Show Tel. Number'\n"
                + "If you want to go start,you need command 'Sign Out'");

    }


    public static void addTelNumber(User user){
        String telNumber;
        Scanner inputNumber = new Scanner(System.in);
        System.out.println(" Please provide your telephone number");
        telNumber = inputNumber.nextLine();
        user.phoneNumber.add(new Number(telNumber));
        System.out.println(">>You have successfully added your number. If you want to add one more please write 'Add Tel. Number'. " +
                "\nIf you want to see your numbers list please write 'Show Tel. Number.'");
    }
    public static void showTelNumber(User user){
        for(Number num: user.phoneNumber){
            System.out.println(num.getPhoneNumber());
        }
    }
    public static void addFriend(){                    // addFriend
        User user = new User();
        user.friendList.put("Gago","Gago");
        user.friendList.put("Vaxo","Vaxo");
        user.friendList.put("Smbo","Smbo");
    }
    public static TreeMap showFriendList(){             //show list
        User user = new User();
        return user.friendList;
    }
    public static TreeMap deleteFriend() {                        //delete friend
        User user = new User();
        boolean result = true;
        Scanner inputName = new Scanner(System.in);
        System.out.println(">> Pleaes provide your friend username");
        String name = inputName.nextLine();
        while(result){
            if(!name.equals(user.friendList.values())){
                result = false;
                System.out.println(">>Sorry. You don't have friend with " + name + " name");
            }
        }
        if(result == true) {
            System.out.println(">>Thank you. Now Garnik and you are not friends.");
        }
            return user.friendList;
    }
}

