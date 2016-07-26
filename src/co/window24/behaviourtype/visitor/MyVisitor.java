package co.window24.behaviourtype.visitor;

/**
 * Created by yuanfei on 7/25/16.
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject subject) {

        System.out.println("Visit the Subject is: I " + subject.getSubject());
    }
}