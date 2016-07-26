package co.window24.structuretype.facadepattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class User {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.startup();
        System.out.println("==============================================");
        computer.shutdown();
    }
}