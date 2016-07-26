package co.window24.behaviourtype.observerpattern.operate;

import co.window24.behaviourtype.observerpattern.subject.impl.AbstractSubject;

/**
 * 观察者模式都是类和类之间到关系,不涉及到继承,当一个对象变化时,其他依赖该对象的对象都会收到通知,并且随其变化,对象之间是一种一对多的关系
 * MySubject类就是我们的主对象,ObServerImplA和ObServerImplB是依赖于MySubject的对象,当MySubject变化时,ObServerImplA和ObServerImplB必然变化.
 * AbstractSubject类中定义着需要监控的对象列表,可以对其进行修改:增加或删除被监控对象,且当MySubject变化时,负责通知在列表内存在当对象.
 *
 * Created by yuanfei on 6/14/16.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {

        System.out.println("Now Update All Subject !");
        notifyObServers();
    }
}
