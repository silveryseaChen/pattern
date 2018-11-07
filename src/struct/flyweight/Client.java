package struct.flyweight;

/**
 * Created by chy on 18/9/24.
 * 享元模式
 */
public class Client {

    public static void main(String[] args) {

        IFlyWeight flyWeight1 = FlyWeightFactory.instance.flyWeight("a");
        flyWeight1.handle();
        IFlyWeight flyWeight2 = FlyWeightFactory.instance.flyWeight("b");
        flyWeight2.handle();
        IFlyWeight flyWeight3 = FlyWeightFactory.instance.flyWeight("b");
        flyWeight3.handle();


    }

}
