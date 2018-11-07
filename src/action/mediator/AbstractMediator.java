package action.mediator;

/**
 * Created by chy on 18/9/16.
 */
public abstract class AbstractMediator {

    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();

}
