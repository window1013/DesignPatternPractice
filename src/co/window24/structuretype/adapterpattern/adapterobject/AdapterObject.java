package co.window24.structuretype.adapterpattern.adapterobject;

/**
 * Created by yuanfei on 7/14/16.
 */
public class AdapterObject implements TargetInterface {

    private Source source;

    public AdapterObject(Source source) {

        super();
        this.source = source;
    }

    public void methodSource() {

        source.methodSource();
    }

    @Override
    public void methodTarget() {

        System.out.println("This is target method!!!!!!");
    }
}
