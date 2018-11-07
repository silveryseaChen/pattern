package action.state;

/**
 * Created by chy on 18/9/19.
 */
public class Door {

    private State state;


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
