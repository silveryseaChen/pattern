package create.factory.stage3.mail;

import create.factory.stage2.Sender;
import create.factory.stage3.Receiver;

/**
 * Created by chy on 18/9/9.
 */
public class MailReceiver implements Receiver {

    @Override
    public void receive() {
        System.out.println("receive a mail..");
    }

}
