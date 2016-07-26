package co.window24.behaviourtype.mediatorpattern;

/**
 * Created by yuanfei on 7/25/16.
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator() {

        return mediator;
    }

    public User(Mediator mediator) {

        this.mediator = mediator;
    }

    public abstract void work();
}