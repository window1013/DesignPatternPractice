package co.window24.behaviourtype.interpreter;

/**
 * Created by yuanfei on 7/25/16.
 */
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {

        return context.getNum1() + context.getNum2();
    }
}