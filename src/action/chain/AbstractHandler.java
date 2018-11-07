package action.chain;

/**
 * Created by chy on 18/9/16.
 */
public abstract class AbstractHandler {

    /**
     * 持有后继的责任对象
     */
    protected AbstractHandler nextHandler;

    public abstract void handleRequest(int n);

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
