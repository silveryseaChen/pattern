package action.chain;

/**
 * Created by chy on 18/9/16.
 */
public class Handler1 extends AbstractHandler {

    @Override
    public void handleRequest(int n) {

        if( n < 100){
            System.out.println(" handler1 handled ... ");
        } else if(getNextHandler() != null){
            getNextHandler().handleRequest(n);
        } else {
            System.out.println(" no handler to handle ... ");
        }

    }

}
