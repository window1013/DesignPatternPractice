package co.window24.structuretype.decoratorpattern;

/**
 * 装饰类
 * Created by yuanfei on 7/15/16.
 */
public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {

        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {

        System.out.println("Before decorator!!!!!!!!");
        sourceable.method();
        System.out.println("After decorator!!!!!!!!!");
    }
}