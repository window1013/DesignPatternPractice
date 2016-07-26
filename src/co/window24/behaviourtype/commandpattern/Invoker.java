package co.window24.behaviourtype.commandpattern;

/**
 * 调用者--司令员
 *
 * Created by yuanfei on 7/22/16.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {

        this.command = command;
    }

    public void action() {

        command.exe();
    }
}