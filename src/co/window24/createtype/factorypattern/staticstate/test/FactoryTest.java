package co.window24.createtype.factorypattern.staticstate.test;

import co.window24.createtype.factorypattern.staticstate.factory.Sender;
import co.window24.createtype.factorypattern.staticstate.operate.SendFactory;

/**
 * Created by yuanfei on 7/13/16.
 */
public class FactoryTest {

    public static void main(String[] args) {

        Sender sender = SendFactory.produceSms();
        sender.send();
    }
}