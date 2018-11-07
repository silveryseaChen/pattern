package struct.decorator;

/**
 * Created by chy on 18/9/25.
 *
 */
public abstract class AbstractPersistentDecorator implements IPersistent {

    IPersistent persistentUtil;

    public AbstractPersistentDecorator(IPersistent persistentUtil){
        this.persistentUtil = persistentUtil;
    }

    @Override
    public void persistent(Object msg){
        persistentUtil.persistent(msg);
    }
}
