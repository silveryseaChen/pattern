package action.template;

/**
 * Created by chy on 18/9/22.
 */
public abstract class AbstractTemplate {

    public void entry(){

        sharedMethod();

        personalMethod();

    }

    public void sharedMethod(){
        System.out.println("shared method");
    }

    public abstract  void personalMethod();

}
