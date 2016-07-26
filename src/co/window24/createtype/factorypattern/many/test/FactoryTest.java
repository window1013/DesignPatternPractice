package co.window24.createtype.factorypattern.many.test;

import co.window24.createtype.factorypattern.many.factory.Sender;
import co.window24.createtype.factorypattern.many.operate.SendFactory;

/**
 * Created by yuanfei on 7/13/16.
 */
public class FactoryTest {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produceSms();
        sender.send();
    }
}