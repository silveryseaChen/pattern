package create.singleton.stage3;

/**
 * Created by chy on 18/9/10.
 * 线程安全
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    /** 效率低 同时只能有一个进程访问 **/
    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
