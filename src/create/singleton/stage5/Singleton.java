package create.singleton.stage5;

/**
 * Created by chy on 18/9/10.
 * 登记式
 */
public class Singleton {

    private Singleton(){

    }
    //lazy
    private static class SingleHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingleHolder.INSTANCE;
    }

}
