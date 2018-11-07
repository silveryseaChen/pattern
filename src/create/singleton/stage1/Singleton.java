package create.singleton.stage1;

/**
 * Created by chy on 18/9/10.
 * 饿汉式
 */
public class Singleton {

    //初始化 创建 不友好
    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

}
