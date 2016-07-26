package co.window24.behaviourtype.chainofresponsibilitypatter;

/**
 * Created by yuanfei on 7/22/16.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {

        this.name = name;
    }

    @Override
    public void operator() {

        System.out.println(name + " deal !!!!!!");

        if (getHandler() != null) {

            getHandler().operator();
        }
    }
}