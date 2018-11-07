package struct.bridge;

/**
 * Created by chy on 18/9/24.
 */
public abstract class AbstractSave {

    ISave save;

    public AbstractSave(ISave save) {
        this.save = save;
    }

    public abstract void save();
}
