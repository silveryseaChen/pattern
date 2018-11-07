package action.state;

/**
 * Created by chy on 18/9/19.
 * 所谓对象的状态，通常指的就是对象实例的属性的值；而行为指的就是对象的功能，再具体点说，行为大多可以对应到方法上。
 * 状态模式的功能就是分离状态的行为，通过维护状态的变化，来调用不同状态对应的不同功能。也就是说，状态和行为是相关联的，它们的关系可以描述为：状态决定行为。
 * 由于状态是在运行期被改变的，因此行为也会在运行期根据状态的改变而改变。
 *
 * 不同的状态 做不同处理
 */
public class Client {

    public static void main(String[] args) {

        Door door = new Door();
        door.setState(new OpenState());


    }


}
