package co.window24.structuretype.adapterpattern.adapterobject;

/**
 * Created by yuanfei on 7/14/16.
 */
public class AdapterTest {

    public static void main(String[] args) {

        Source source = new Source();
        TargetInterface target = new AdapterObject(source);
        target.methodSource();
        target.methodTarget();
    }
}