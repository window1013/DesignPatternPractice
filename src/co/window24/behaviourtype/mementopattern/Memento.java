package co.window24.behaviourtype.mementopattern;

/**
 * 备忘录类
 *
 * Created by yuanfei on 7/25/16.
 */
public class Memento {

    private String value;

    public Memento(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}