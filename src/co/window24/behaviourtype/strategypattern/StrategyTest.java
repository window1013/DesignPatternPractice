package co.window24.behaviourtype.strategypattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public class StrategyTest {

    public static void main(String[] args) {

        String exp = "2+8";
        ICalculator cal = new Plus();
        System.out.println(cal.calculate(exp));

        String exp1 = "8-2";
        ICalculator cal1 = new Minus();
        System.out.println(cal1.calculate(exp1));

        String exp2 = "2*8";
        ICalculator cal2 = new Multiply();
        System.out.println(cal2.calculate(exp2));
    }
}