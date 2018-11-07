package create.factory.stage3;

import create.factory.stage3.mail.MailFactory;
import create.factory.stage3.sms.SmsFactory;

/**
 * Created by chy on 18/9/11.
 * 抽象工厂
 * 适用于 一系列 对象 关联处理的情况
 *  只需改变工厂类 就可以在不同的系列之间切换
 * 如果 工厂中 需要 产生新的对象 则 改动较大
 *
 * http://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory factory = new MailFactory();
//        AbstractFactory create.factory = new SmsFactory();
        factory.produceReceiver().receive();
        factory.produceSender().send();

    }


}
