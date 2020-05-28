package jason.designpatterns.iterator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class IteratorTest {

    @Test
    public void testIterator() {
        Aggregate aggregate = new ConcreteAggregate();
        for (int i = 0; i < 3; i++) {
            Assert.assertTrue(aggregate.add(new Object()));
        }
        Assert.assertFalse(aggregate.remove(null));

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            Assert.assertNotNull(iterator.next());
        }
    }

}
