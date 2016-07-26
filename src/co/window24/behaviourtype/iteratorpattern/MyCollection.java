package co.window24.behaviourtype.iteratorpattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public class MyCollection implements Collection {

    public String[] str = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {

        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {

        return str[i];
    }

    @Override
    public int size() {

        return str.length;
    }
}