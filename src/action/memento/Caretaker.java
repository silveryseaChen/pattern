package action.memento;

/**
 * Created by chy on 18/9/16.
 */
public class Caretaker {

    private IMemento memento;
    /**
     * 备忘录取值方法
     */
    public IMemento retrieveMemento(){
        return memento;
    }
    /**
     * 备忘录赋值方法
     */
    public void saveMemento(IMemento memento){
        this.memento = memento;
    }
}
