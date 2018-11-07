package action.interpreter.impl;

import action.interpreter.Context;
import action.interpreter.Expression;

/**
 * Created by chy on 18/9/16.
 */
public class Constant extends Expression {

    private boolean value;

    public Constant(boolean value){
        this.value = value;
    }

    @Override
    public boolean interpret(Context ctx) {

        return value;
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }

}