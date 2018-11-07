package create.factory.stage1.sender;

import create.factory.stage1.Sender;

/**
 * Created by chy on 18/9/9.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("send a sms..");
    }

}
