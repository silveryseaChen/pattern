package action.interpreter.impl;

import action.interpreter.Context;
import action.interpreter.Expression;

/**
 * Created by chy on 18/9/16.
 */
public class Variable extends Expression {

    private String name;

    public Variable(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

}
