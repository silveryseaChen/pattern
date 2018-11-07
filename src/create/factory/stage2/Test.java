package create.factory.stage2;

import create.factory.stage2.sms.SmsSenderFactory;

/**
 * Created by chy on 18/9/9.
 * 工厂方法
 *
 * 每个工厂常见自己需要的对象，相互不影响，但获取到该对象后 可以用统一的方式来使用
 *  鲜明的例子 collection 的 action.iterator  list set 都有该方法， 获取到iterator 后 使用方式相同
 *
 *
 */
public class Test {

    public static void main(String[] args) {


//        SenderFactory create.factory = new MailFactory();
        SenderFactory factory = new SmsSenderFactory();
        Sender sender = factory.produce();
        sender.send();

    }

}
