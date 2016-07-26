package co.window24.behaviourtype.strategypattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {

        int[] arrayInt = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}