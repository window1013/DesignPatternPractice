package co.window24.behaviourtype.templatemethodpattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public class TemplateTest {

    public static void main(String[] args) {

        String exp = "9+2";
        AbstractCalculator cal = new Plus();
        System.out.println(cal.calculate(exp, "\\+"));
    }
}