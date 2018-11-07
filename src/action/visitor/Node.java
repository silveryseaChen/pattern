package action.visitor;

/**
 * Created by chy on 18/9/22.
 */
public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
