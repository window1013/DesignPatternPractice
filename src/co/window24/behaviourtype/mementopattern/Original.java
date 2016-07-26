package co.window24.behaviourtype.mementopattern;

/**
 * 原始类, 包括需要保存的属性及创建一个备忘录类,用来保存value值
 *
 * Created by yuanfei on 7/25/16.
 */
public class Original {

    private String value;

    public Original(String value) {

        this.value = value;
    }

    public Memento createMemento() {

        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {

        this.value = memento.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}