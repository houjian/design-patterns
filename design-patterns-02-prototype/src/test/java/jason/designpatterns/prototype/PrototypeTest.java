package jason.designpatterns.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class PrototypeTest {

    @Test
    public void testPrototype() {
        Realizetype prototype = new Realizetype();

        Realizetype first = prototype.clone();
        Realizetype second = prototype.clone();
        Assert.assertNotSame(first, prototype);
        Assert.assertNotSame(second, prototype);
    }

}
