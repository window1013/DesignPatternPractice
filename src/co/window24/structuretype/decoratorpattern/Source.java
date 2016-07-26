package co.window24.structuretype.decoratorpattern;

/**
 * 被装饰的类
 * Created by yuanfei on 7/15/16.
 */
public class Source implements Sourceable {

    @Override
    public void method() {

        System.out.println("被装饰的类在这里!");
    }
}