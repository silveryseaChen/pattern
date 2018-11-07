package action.visitor;

/**
 * Created by chy on 18/9/22.
 */
public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
