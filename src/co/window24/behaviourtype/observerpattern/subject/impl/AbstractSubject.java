package co.window24.behaviourtype.observerpattern.subject.impl;

import co.window24.behaviourtype.observerpattern.observer.ObServer;
import co.window24.behaviourtype.observerpattern.subject.Subject;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yuanfei on 6/14/16.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<ObServer> vector = new Vector<>();

    @Override
    public void add(ObServer obServer) {

        vector.add(obServer);
    }

    @Override
    public void del(ObServer obServer) {

        vector.remove(obServer);
    }

    @Override
    public void notifyObServers() {

        Enumeration<ObServer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {

            enumo.nextElement().update();
        }
    }
}
