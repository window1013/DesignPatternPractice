package co.window24.createtype.abstractfactorypattern.operate;

import co.window24.createtype.abstractfactorypattern.abstractfactory.Sender;

/**
 * Created by yuanfei on 7/13/16.
 */
public interface Provider {

    public Sender produce();
}