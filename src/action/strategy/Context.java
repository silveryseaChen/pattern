package action.strategy;

/**
 * Created by chy on 18/9/21.
 */
public class Context {

    private IStrategy strategy;


    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.execute();
    }

}
