package co.window24.behaviourtype.mediatorpattern;

/**
 * Created by yuanfei on 7/25/16.
 */
public class User1 extends User {

    public User1(Mediator mediator) {

        super(mediator);
    }

    @Override
    public void work() {

        System.out.println("User1 Exe !!!!!!");
    }
}