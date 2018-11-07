package action.observer;

import java.util.Observable;

/**
 * Created by chy on 18/9/18.
 */
public class User extends Observable {

    private String name;
    private String state;
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
