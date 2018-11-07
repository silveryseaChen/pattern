package action.chain;

/**
 * Created by chy on 18/9/16.
 */
public class Handler2 extends AbstractHandler {

    @Override
    public void handleRequest(int n) {

        if( n > 100){
            System.out.println(" handler2 handled ... ");
        } else {
            System.out.println(" no handler to handle ... ");
        }

    }

}
