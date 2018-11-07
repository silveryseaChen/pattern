package action.interpreter.impl;

import action.interpreter.Context;
import action.interpreter.Expression;

/**
 * Created by chy on 18/9/16.
 */
public class Not extends Expression {

    private Expression exp;

    public Not(Expression exp){
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(Not " + exp.toString() + ")";
    }

}
