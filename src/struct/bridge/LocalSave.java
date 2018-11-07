package struct.bridge;

/**
 * Created by chy on 18/9/24.
 */
public class LocalSave extends AbstractSave {

    public LocalSave(ISave save) {
        super(save);
    }

    @Override
    public void save() {
        System.out.println("local ");
        this.save.save();
    }
}
