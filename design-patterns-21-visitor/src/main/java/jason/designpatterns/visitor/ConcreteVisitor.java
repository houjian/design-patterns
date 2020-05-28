package jason.designpatterns.visitor;

import jason.designpatterns.visitor.element.FirstElement;
import jason.designpatterns.visitor.element.SecondElement;

/**
 * 具体访问者
 *
 * @author Jason Hou
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(FirstElement element) {
        System.out.println("访问" + element);
    }

    @Override
    public void visit(SecondElement element) {
        System.out.println("访问" + element);
    }

}
