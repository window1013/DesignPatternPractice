package co.window24.behaviourtype.visitor;

/**
 * Created by yuanfei on 7/25/16.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }

    @Override
    public String getSubject() {

        return "Love HuaHua !!!";
    }
}