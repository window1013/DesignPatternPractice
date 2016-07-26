package co.window24.structuretype.bridgepattern;

/**
 * Created by yuanfei on 7/18/16.
 */
public class BridgeTest {

    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        // 调用第一个Sub
        Sourceable sourceable1 = new SourceSub1();
        bridge.setSourceable(sourceable1);
        bridge.method();

        // 调用第二个Sub
        Sourceable sourceable2 = new SourceSub2();
        bridge.setSourceable(sourceable2);
        bridge.method();
    }
}