package co.window24.behaviourtype.visitor;

/**
 * 存放要访问的对象
 *
 * Created by yuanfei on 7/25/16.
 */
public interface Visitor {

    public void visit(Subject subject);
}