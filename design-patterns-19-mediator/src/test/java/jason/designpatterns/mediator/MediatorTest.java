package jason.designpatterns.mediator;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class MediatorTest {

    @Test
    public void test() {
        Mediator md = new ConcreteMediator();
        AbstractColleague colleague1 = new ConcreteColleague1();
        AbstractColleague colleague2 = new ConcreteColleague2();
        md.register(colleague1);
        md.register(colleague2);

        colleague1.send();
        System.out.println("-------------");
        colleague2.send();
    }

}
