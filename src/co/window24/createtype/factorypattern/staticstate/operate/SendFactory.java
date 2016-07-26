package co.window24.createtype.factorypattern.staticstate.operate;


import co.window24.createtype.factorypattern.staticstate.factory.impl.MailSender;
import co.window24.createtype.factorypattern.staticstate.factory.Sender;
import co.window24.createtype.factorypattern.staticstate.factory.impl.SmsSender;

/**
 * 静态工厂方法模式中,将工厂方法设为静态,可不需要创建实例,直接调用即可
 *
 * Created by yuanfei on 7/13/16.
 */
public class SendFactory {

    public static Sender produceMail() {

        return new MailSender();
    }

    public static Sender produceSms() {

        return new SmsSender();
    }
}