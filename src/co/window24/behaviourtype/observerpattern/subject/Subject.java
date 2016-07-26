package co.window24.behaviourtype.observerpattern.subject;

import co.window24.behaviourtype.observerpattern.observer.ObServer;

/**
 * 操作者接口
 * Created by yuanfei on 6/14/16.
 */
public interface Subject {

    // 增加观察者
    public void add(ObServer obServer);

    // 删除观察者
    public void del(ObServer obServer);

    // 通知所有的观察者
    public void notifyObServers();

    // 自身的操作
    public void operation();
}
