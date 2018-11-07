package create.prototype;

/**
 * Created by chy on 18/9/16.
 * 原型模式
 * 一个对象经常被clone 或者 clone 比较麻烦的时候 可以使用该模式
 */
public class Test {

    public static void main(String[] args) throws Exception {

        ProtoTypeObject object = new ProtoTypeObject();
        object.setProp1("prop1");
        object.setProp2("prop2");
        object.setOther("other");
        System.out.println(object);

        ProtoTypeObject cloneObject = object.clone();
        System.out.println(cloneObject);

    }


}
