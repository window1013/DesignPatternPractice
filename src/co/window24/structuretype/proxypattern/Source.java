package co.window24.structuretype.proxypattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class Source implements Sourceable {

    @Override
    public void method() {

        System.out.println("Proxy Pattern's Original Method!!!!!");
    }
}