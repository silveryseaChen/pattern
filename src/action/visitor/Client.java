package action.visitor;

/**
 * Created by chy on 18/9/22.
 * 比较复杂 只能说大概明白了 动态双分派的概念
 * 具体没有使用过
 */
public class Client {

    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new NodeA());
        //给结构增加一个节点
        os.add(new NodeB());
        //创建一个访问者
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }

}
