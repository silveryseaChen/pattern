package struct.decorator;

/**
 * Created by chy on 18/9/25.
 *
 */
public class PersistentNetDecorator extends AbstractPersistentDecorator {

    public PersistentNetDecorator(IPersistent persistentUtil){
        super(persistentUtil);
    }

    @Override
    public void persistent(Object msg){
        persistentUtil.persistent(msg);
        persistentNet(msg);
    };

    public void persistentNet(Object msg){
        System.out.println("persistent to net");
    };
}
