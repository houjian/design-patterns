package jason.designpatterns.visitor;

import jason.designpatterns.visitor.element.FirstElement;
import jason.designpatterns.visitor.element.SecondElement;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class VisitorTest {

    @Test
    public void testIterator() {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new FirstElement());
        structure.attach(new SecondElement());
        structure.detach(null);

        structure.accept(new ConcreteVisitor());
    }

}