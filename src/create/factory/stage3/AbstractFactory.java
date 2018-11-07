package create.factory.stage3;

/**
 * Created by chy on 18/9/11.
 */
public interface AbstractFactory {

    Sender produceSender();

    Receiver produceReceiver();


}
