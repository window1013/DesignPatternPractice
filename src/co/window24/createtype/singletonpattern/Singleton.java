package co.window24.createtype.singletonpattern;

/**
 * Created by yuanfei on 7/13/16.
 */
public class Singleton {

    // 私有构造方法,防止被实例化
    private Singleton() {
    }

    // 使用一个内部类来维护单例
    private static class SingletonFactory {

        private static Singleton instance = new Singleton();
    }

    // 获取实例
    public static Singleton getInstance() {

        return SingletonFactory.instance;
    }

    // 如果对象被用于实例化,可以保证对象在序列化前后保持一致
    public Object readResolve() {

        return getInstance();
    }
}