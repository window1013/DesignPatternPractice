package co.window24.structuretype.bridgepattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class MyBridge extends Bridge {

    public void method() {

        getSourceable().method();
    }
}