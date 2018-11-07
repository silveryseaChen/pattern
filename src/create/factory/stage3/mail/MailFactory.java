package create.factory.stage3.mail;

import create.factory.stage3.AbstractFactory;
import create.factory.stage3.Receiver;
import create.factory.stage3.Sender;

/**
 * Created by chy on 18/9/9.
 */
public class MailFactory implements AbstractFactory {

    @Override
    public Sender produceSender() {
        return new MailSender();
    }

    @Override
    public Receiver produceReceiver() {
        return new MailReceiver();
    }
}
