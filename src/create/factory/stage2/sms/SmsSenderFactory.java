package create.factory.stage2.sms;

import create.factory.stage2.Sender;
import create.factory.stage2.SenderFactory;

/**
 * Created by chy on 18/9/9.
 */
public class SmsSenderFactory implements SenderFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
