package create.singleton.stage2;

/**
 * Created by chy on 18/9/10.
 * 懒汉式
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    /**懒加载但 多线程 第一次创建是 不安全**/
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
