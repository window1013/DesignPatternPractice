package co.window24.behaviourtype.mementopattern;

/**
 * 存储备忘录的类,持有备忘录类的实例
 *
 * Created by yuanfei on 7/25/16.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {

        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}