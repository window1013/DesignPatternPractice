package co.window24.behaviourtype.iteratorpattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public interface Iterator {

    // 前移
    public Object previous();

    // 后移
    public Object next();

    public boolean hasNext();

    //取得第一个元素
    public Object first();
}