package action.interpreter.impl;

import action.interpreter.Context;
import action.interpreter.Expression;

/**
 * Created by chy on 18/9/16.
 */
public class And extends Expression {

    private Expression left,right;

    public And(Expression left , Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {

        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }

}
