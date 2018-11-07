package struct.adapter;

/**
 * Created by chy on 18/9/24.
 *
 * 适配器模式
 * 为了方便处理添加适配器 来做统一处理
 */
public class Client {

    public static void main(String[] args) {

        Target target = new Adapter(new Adaptee());
        target.sampleOperation1();
        target.sampleOperation2();


    }

}
