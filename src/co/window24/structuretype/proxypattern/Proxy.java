package co.window24.structuretype.proxypattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {

        super();
        this.source = new Source();
    }

    @Override
    public void method() {

        before();
        source.method();
        after();
    }

    private void before() {

        System.out.println("Before Proxy.............");
    }

    private void after() {

        System.out.println("After Proxy..............");
    }
}