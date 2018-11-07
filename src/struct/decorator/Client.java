package struct.decorator;

/**
 * Created by chy on 18/9/25.
 * 装饰模式
 * 可以在不改变原有类的基础上增强 其功能
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 */
public class Client {

    public static void main(String[] args) {

        IPersistent persistent = new Persistent();
        String msg = " ---message---  ";
        persistent.persistent(msg);
        AbstractPersistentDecorator decorator = new PersistentDBDecorator(persistent);
        decorator.persistent(msg);
        decorator = new PersistentNetDecorator(decorator);
        decorator.persistent(msg);

    }

}
