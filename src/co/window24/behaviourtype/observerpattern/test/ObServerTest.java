package co.window24.behaviourtype.observerpattern.test;

import co.window24.behaviourtype.observerpattern.observer.impl.ObServerImplA;
import co.window24.behaviourtype.observerpattern.observer.impl.ObServerImplB;
import co.window24.behaviourtype.observerpattern.operate.MySubject;
import co.window24.behaviourtype.observerpattern.subject.Subject;

/**
 * Created by yuanfei on 6/14/16.
 */
public class ObServerTest {

    public static void main(String[] args) {

        Subject subject = new MySubject();

        subject.add(new ObServerImplA());
        subject.add(new ObServerImplB());

        subject.operation();
    }
}
