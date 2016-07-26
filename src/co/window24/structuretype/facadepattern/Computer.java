package co.window24.structuretype.facadepattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {

        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {

        System.out.println("Start the Computer!!!!!!!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("Start computer finished!!");
    }

    public void shutdown() {

        System.out.println("Begin to Close the Computer!!!!!!!!!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("The Computer closed!!!!!!!!!!!!!!!!!");
    }
}