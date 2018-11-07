package create.factory.stage2.mail;

import create.factory.stage2.Sender;

/**
 * Created by chy on 18/9/9.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("send a mail..");
    }

}
