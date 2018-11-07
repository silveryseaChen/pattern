package action.observer;

/**
 * Created by chy on 18/9/18.
 */
public class Client {

    public static void main(String[] args) {

        User user = new User();
        new Logger(user);
        user.setName("name");
    }


}
