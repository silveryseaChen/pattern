package create.singleton.stage4;

/**
 * Created by chy on 18/9/10.
 * 双重检查
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    /** 性能差 **/
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }

}
