package co.window24.createtype.factorypattern.staticstate.factory.impl;

import co.window24.createtype.factorypattern.staticstate.factory.Sender;

/**
 * 邮件发送
 *
 * Created by yuanfei on 7/13/16.
 */
public class MailSender implements Sender {

    @Override
    public void send() {

        System.out.println("This is mail-sender!");
    }
}