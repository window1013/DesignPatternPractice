package co.window24.behaviourtype.visitor;

/**
 * accept-接受将要访问它的对象   getSubject-获取将要被访问的属性
 *
 * Created by yuanfei on 7/25/16.
 */
public interface Subject {

    public void accept(Visitor visitor);
    public String getSubject();
}