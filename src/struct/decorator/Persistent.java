package struct.decorator;

/**
 * Created by chy on 18/9/25.
 */
public class Persistent implements IPersistent {
    @Override
    public void persistent(Object msg) {
        System.out.println(" persistent " + msg);
    }
}
