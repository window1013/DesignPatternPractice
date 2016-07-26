package co.window24.createtype.abstractfactorypattern.abstractfactory.impl;

import co.window24.createtype.abstractfactorypattern.abstractfactory.Sender;

/**
 * Created by yuanfei on 7/13/16.
 */
public class MailSender implements Sender {

    @Override
    public void send() {

        System.out.println("Hey Man, This is Mail-Send!");
    }
}