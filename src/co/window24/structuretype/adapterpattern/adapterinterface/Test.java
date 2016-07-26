package co.window24.structuretype.adapterpattern.adapterinterface;

/**
 * Created by yuanfei on 7/15/16.
 */
public class Test {

    public static void main(String[] args) {

        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        System.out.println("================================");
        source1.method1();
        System.out.println("================================");
        source1.method2();
        System.out.println("================================");
        source2.method1();
        System.out.println("================================");
        source2.method2();
        System.out.println("================================");
    }
}