package co.window24.behaviourtype.interpreter;

/**
 * Created by yuanfei on 7/25/16.
 */
public class Test {

    public static void main(String[] args) {

        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}