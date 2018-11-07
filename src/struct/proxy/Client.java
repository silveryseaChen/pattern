package struct.proxy;

/**
 * Created by chy on 18/9/24.
 */
public class Client {

    public static void main(String[] args) {

        AbstractObject obj = new ProxyObject();
        obj.operation();

    }

}
