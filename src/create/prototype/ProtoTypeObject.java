package create.prototype;

/**
 * Created by chy on 18/9/16.
 */
public class ProtoTypeObject implements Cloneable {

    private String prop1;

    private String prop2;

    //transient 属性 被clone 但不会被序列化（如果 implements Serializable 的话）
    private transient String other;

    @Override
    public ProtoTypeObject clone() throws CloneNotSupportedException{
        return (ProtoTypeObject)super.clone();
    }

    //只为了方便输出 和该模式 无关
    public String toString(){

        StringBuffer sb = new StringBuffer();
        if(this.prop1 != null){
            sb.append("prop1=").append(prop1).append(",");
        }
        if(this.prop2 != null){
            sb.append("prop2=").append(prop2).append(",");
        }
        if(this.other != null){
            sb.append("other=").append(other).append(",");
        }

        return sb.toString();
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
