package co.window24.behaviourtype.iteratorpattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public class Test {

    public static void main(String[] args) {

        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }
}