package co.window24.createtype.factorypattern.many.factory.impl;

import co.window24.createtype.factorypattern.many.factory.Sender;

/**
 * 短信发送
 *
 * Created by yuanfei on 7/13/16.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {

        System.out.println("This is Sms-sender!");
    }
}