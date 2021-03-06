package co.window24.structuretype.bridgepattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public abstract class Bridge {

    private Sourceable sourceable;

    public void method() {

        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}