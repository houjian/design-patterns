package jason.designpatterns.interpreter;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class InterpreterTest {

    @Test
    public void testInterpreter() {
        String expression = "6 100 11 + *";
        int result = Operator.parse(expression);
        Assert.assertEquals(result, 666);
    }

}
