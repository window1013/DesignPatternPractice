package co.window24.createtype.factorypattern.many.operate;


import co.window24.createtype.factorypattern.many.factory.Sender;
import co.window24.createtype.factorypattern.many.factory.impl.SmsSender;
import co.window24.createtype.factorypattern.many.factory.impl.MailSender;

/**
 * 多工厂方法模式中,提供多个工厂方法,分别创建对象
 *
 * Created by yuanfei on 7/13/16.
 */
public class SendFactory {

    public Sender produceMail() {

        return new MailSender();
    }

    public Sender produceSms() {

        return new SmsSender();
    }
}