package struct.composite;

/**
 * Created by chy on 18/9/24.
 */
public abstract class Component {
    String name;

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void eachChild();
}
