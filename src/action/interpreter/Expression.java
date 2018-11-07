package action.interpreter;

/**
 * Created by chy on 18/9/16.
 */
public abstract class Expression {
    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     */
    public abstract boolean interpret(Context ctx);
}
