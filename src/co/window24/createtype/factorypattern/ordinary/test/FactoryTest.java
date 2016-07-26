package co.window24.createtype.factorypattern.ordinary.test;

import co.window24.createtype.factorypattern.ordinary.factory.Sender;
import co.window24.createtype.factorypattern.ordinary.operate.SendFactory;

/**
 * Created by yuanfei on 7/13/16.
 */
public class FactoryTest {

    public static void main(String[] args) {

        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}