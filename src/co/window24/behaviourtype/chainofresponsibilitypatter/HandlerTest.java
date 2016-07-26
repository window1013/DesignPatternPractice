package co.window24.behaviourtype.chainofresponsibilitypatter;

/**
 * Created by yuanfei on 7/22/16.
 */
public class HandlerTest {

    public static void main(String[] args) {

        MyHandler m1 = new MyHandler("Zhang da");
        MyHandler m2 = new MyHandler("Zhao er");
        MyHandler m3 = new MyHandler("Sun san");

        m1.setHandler(m2);
        m2.setHandler(m3);

        m1.operator();
    }
}