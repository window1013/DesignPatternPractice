package co.window24.createtype.singletonpattern;

/**
 * Created by yuanfei on 7/13/16.
 */
public class SingletonAnother {

    private static SingletonAnother instance = null;

    private SingletonAnother() {
    }

    private static synchronized void syncInit() {

        if (instance == null) {

            instance = new SingletonAnother();
        }
    }

    public static SingletonAnother getInstance() {

        if (instance == null) {

            syncInit();
        }

        return instance;
    }
}