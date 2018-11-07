package struct.decorator;

/**
 * Created by chy on 18/9/25.
 *
 */
public class PersistentDBDecorator extends AbstractPersistentDecorator {

    public PersistentDBDecorator(IPersistent persistentUtil){
        super(persistentUtil);
    }

    @Override
    public void persistent(Object msg){
        persistentUtil.persistent(msg);
        persistentDB(msg);
    };

    public void persistentDB(Object msg){
        System.out.println("persistent to db");
    };
}
