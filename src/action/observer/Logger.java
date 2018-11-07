package action.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chy on 18/9/18.
 */
public class Logger implements Observer {

    public Logger(){}

    public Logger(Observable o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(" save current data " + o);
    }
}
