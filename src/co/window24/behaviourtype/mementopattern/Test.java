package co.window24.behaviourtype.mementopattern;

/**
 * Created by yuanfei on 7/25/16.
 */
public class Test {

    public static void main(String[] args) {

        // 创建原始类
        Original original = new Original("YuanShi");

        // 创建备忘录类
        Storage storage = new Storage(original.createMemento());

        // 修改原始类的状态
        System.out.println("原始状态为:" + original.getValue());
        original.setValue("XiuGai");
        System.out.println("修改后的状态为:" + original.getValue());

        // 恢复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为:" + original.getValue());
        System.out.println(storage.getMemento().getValue());
    }
}