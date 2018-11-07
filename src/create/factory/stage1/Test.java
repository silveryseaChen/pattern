package create.factory.stage1;

/**
 * Created by chy on 18/9/9.
 * 简单工厂
 */
public class Test {

    public static void main(String[] args) {

        SenderFactory factory = new SenderFactory();
        Sender sender = factory.produce("mail");
        sender.send();

    }

}
