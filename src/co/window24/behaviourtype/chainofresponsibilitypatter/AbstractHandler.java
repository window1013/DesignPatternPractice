package co.window24.behaviourtype.chainofresponsibilitypatter;

/**
 * Created by yuanfei on 7/22/16.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}