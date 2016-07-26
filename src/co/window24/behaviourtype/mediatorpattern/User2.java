package co.window24.behaviourtype.mediatorpattern;

/**
 * Created by yuanfei on 7/25/16.
 */
public class User2 extends User {

    public User2(Mediator mediator) {

        super(mediator);
    }

    @Override
    public void work() {

        System.out.println("User2 Exe !!!!!!");
    }
}