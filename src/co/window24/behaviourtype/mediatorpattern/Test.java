package co.window24.behaviourtype.mediatorpattern;

/**
 * Created by yuanfei on 7/25/16.
 */
public class Test {

    public static void main(String[] args) {

        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
