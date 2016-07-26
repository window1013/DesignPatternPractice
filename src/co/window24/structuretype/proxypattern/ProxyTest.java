package co.window24.structuretype.proxypattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class ProxyTest {

    public static void main(String[] args) {

        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}