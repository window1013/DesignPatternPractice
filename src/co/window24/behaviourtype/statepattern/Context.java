package co.window24.behaviourtype.statepattern;

/**
 * Created by yuanfei on 7/25/16.
 */
public class Context {

    private State state;

    public Context(State state) {

        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {

        if (state.getValue().equals("state1")) {

            state.method1();
        } else if (state.getValue().equals("state2")) {

            state.method2();
        }
    }
}