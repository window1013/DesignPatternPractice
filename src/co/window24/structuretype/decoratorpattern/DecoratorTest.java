package co.window24.structuretype.decoratorpattern;

/**
 * Created by yuanfei on 7/15/16.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method();
    }
}