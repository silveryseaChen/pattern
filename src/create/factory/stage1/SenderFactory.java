package create.factory.stage1;

import create.factory.stage1.sender.MailSender;
import create.factory.stage1.sender.SmsSender;

/**
 * Created by chy on 18/9/9.
 */
public class SenderFactory {

    Sender produce(String type){

        Sender sender = null;

        switch (type){
            case "sms": sender = new SmsSender(); break;
            case "mail": sender = new MailSender(); break;
        }

        return sender;
    }

}
