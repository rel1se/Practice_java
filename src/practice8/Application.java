package practice8;
import java.util.ArrayList;
public class Application {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<User>();
        User testUser = new User("Nike", 10);
        users.add(testUser);
        users.add(new User("Slava", 19));
        users.add(new User("Vlad", 19));
        users.add(new User("Grisha", 18));
        users.add(new User("Nikita", 17));
        WaitList<User> waitList = new WaitList<>(users);
        System.out.println(waitList);
        waitList.add(new User("No one", 1000));
        System.out.println(waitList.contains(testUser));
        System.out.println(waitList);
    }
}
