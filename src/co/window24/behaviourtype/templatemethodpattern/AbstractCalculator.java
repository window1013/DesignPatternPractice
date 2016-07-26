package co.window24.behaviourtype.templatemethodpattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public abstract class AbstractCalculator {

    // 主方法 实现对本类其他方法的调用
    public final int calculate(String exp, String opt) {

        int[] arInt = split(exp, opt);
        return calculate(arInt[0], arInt[1]);
    }

    // 被子类重写的方法
    abstract public int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {

        int[] spInt = new int[2];
        String[] str = exp.split(opt);
        spInt[0] = Integer.parseInt(str[0]);
        spInt[1] = Integer.parseInt(str[1]);
        return spInt;
    }
}