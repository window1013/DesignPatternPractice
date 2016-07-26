package co.window24.structuretype.adapterpattern.adapterclass;

/**
 * Created by yuanfei on 7/14/16.
 */
public class AdapterTest {

    public static void main(String[] args) {

        TargetInterface target = new AdapterClass();
        target.methodSource();
        target.methodTarget();
    }
}