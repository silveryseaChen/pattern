package struct.bridge;

/**
 * Created by chy on 18/9/24.
 *
 * 桥接模式
 * 将抽象部分与它的实现部分分离，使它们都可以独立的变化。
 *
 *
 */
public class Client {

    public static void main(String[] args) {

        AbstractSave save = new LocalSave(new FileSave());
        save.save();

    }

}
