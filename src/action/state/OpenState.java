package action.state;

/**
 * Created by chy on 18/9/19.
 */
public class OpenState implements State {
    @Override
    public void handle() {
        System.out.println("open ...");
    }
}
