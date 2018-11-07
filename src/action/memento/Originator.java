package action.memento;

/**
 * Created by chy on 18/9/16.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }
    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public IMemento createMemento(){
        return new Memento(state);
    }
    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(IMemento memento){
        this.setState(((Memento)memento).getState());
    }

    private class Memento implements IMemento{

        private String state;
        /**
         * 构造方法
         */
        private Memento(String state){
            this.state = state;
        }

        private String getState() {
            return state;
        }
        private void setState(String state) {
            this.state = state;
        }
    }
}
