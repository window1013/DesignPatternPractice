package co.window24.structuretype.adapterpattern.adapterclass;

/**
 * Created by yuanfei on 7/14/16.
 */
public class AdapterClass extends Source implements TargetInterface {

    @Override
    public void methodTarget() {

        System.out.println("This is target method!!!!!!");
    }
}
