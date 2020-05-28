package jason.designpatterns.visitor.element;

import jason.designpatterns.visitor.Visitor;

/**
 * 具体元素
 *
 * @author Jason Hou
 */
public class SecondElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
