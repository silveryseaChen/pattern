package create.factory.stage3.sms;

import create.factory.stage3.Receiver;

/**
 * Created by chy on 18/9/9.
 */
public class SmsReceiver implements Receiver {

    @Override
    public void receive() {
        System.out.println("receive a sms..");
    }

}
