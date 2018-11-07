package struct.flyweight;

/**
 * Created by chy on 18/9/24.
 */
public class FlyWeight implements IFlyWeight {

    private String state;

    protected FlyWeight(String state) {
        this.state = state;
        System.out.println(" create a new object");
    }

    @Override
    public void handle() {
        System.out.println(state);
    }
}
