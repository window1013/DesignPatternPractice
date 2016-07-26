package co.window24.behaviourtype.visitor;

/**
 * 访问者模式
 *
 * Created by yuanfei on 7/25/16.
 */
public class Test {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}