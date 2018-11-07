package action.state;

/**
 * Created by chy on 18/9/19.
 */
public class CloseState implements State {
    @Override
    public void handle() {
        System.out.println("close ...");
    }
}
