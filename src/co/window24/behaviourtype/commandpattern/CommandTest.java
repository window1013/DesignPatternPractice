package co.window24.behaviourtype.commandpattern;

/**
 * Created by yuanfei on 7/22/16.
 */
public class CommandTest {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Command command = new MyCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}