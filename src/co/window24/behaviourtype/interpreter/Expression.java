package co.window24.behaviourtype.interpreter;

/**
 * 解释器模式
 *
 * Created by yuanfei on 7/25/16.
 */
public interface Expression {

    public int interpret(Context context);
}