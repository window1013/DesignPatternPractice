package co.window24.behaviourtype.observerpattern.observer.impl;

import co.window24.behaviourtype.observerpattern.observer.ObServer;

/**
 * Created by yuanfei on 6/14/16.
 */
public class ObServerImplB implements ObServer {

    @Override
    public void update() {

        System.out.println("This is First ObServer, ObServerImplA is received!");
    }
}
