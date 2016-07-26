package co.window24.createtype.factorypattern.ordinary.operate;

import co.window24.createtype.factorypattern.ordinary.factory.Sender;
import co.window24.createtype.factorypattern.ordinary.factory.impl.MailSender;
import co.window24.createtype.factorypattern.ordinary.factory.impl.SmsSender;

/**
 * 普通工厂模式实际上就是通过一个工厂类,对实现了同一个接口对一些类进行实例化的创建,起到一个精简代码到作用
 *
 * Created by yuanfei on 7/13/16.
 */
public class SendFactory {

    public Sender produce(String type) {

        if ("mail".equals(type)) {

            return new MailSender();
        } else if ("sms".equals(type)) {

            return new SmsSender();
        } else {

            System.out.println("Please use right type!");
            return null;
        }
    }
}