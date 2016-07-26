package co.window24.createtype.abstractfactorypattern.test;

import co.window24.createtype.abstractfactorypattern.abstractfactory.Sender;
import co.window24.createtype.abstractfactorypattern.operate.Provider;
import co.window24.createtype.abstractfactorypattern.operate.impl.SendMailProvider;

/**
 * Created by yuanfei on 7/13/16.
 */
public class Test {

    public static void main(String[] args) {

        Provider provider = new SendMailProvider();
        Sender sender = provider.produce();
        sender.send();
    }
}