package co.window24.createtype.abstractfactorypattern.operate.impl;

import co.window24.createtype.abstractfactorypattern.abstractfactory.Sender;
import co.window24.createtype.abstractfactorypattern.abstractfactory.impl.MailSender;
import co.window24.createtype.abstractfactorypattern.operate.Provider;

/**
 * Created by yuanfei on 7/13/16.
 */
public class SendMailProvider implements Provider {

    @Override
    public Sender produce() {

        return new MailSender();
    }
}