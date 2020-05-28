package jason.designpatterns.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class SingletonTest {

    @Test
    public void testLazySingleton() {
        LazySingleton first = LazySingleton.getInstance();
        LazySingleton second = LazySingleton.getInstance();
        Assert.assertSame(first, second);
    }

    @Test
    public void testHungrySingleton() {
        HungrySingleton first = HungrySingleton.getInstance();
        HungrySingleton second = HungrySingleton.getInstance();
        Assert.assertSame(first, second);
    }

    @Test
    public void testStaticHolderSingleton() {
        StaticHolderSingleton first = StaticHolderSingleton.getInstance();
        StaticHolderSingleton second = StaticHolderSingleton.getInstance();
        Assert.assertSame(first, second);
    }

    @Test
    public void testEnumSingleton() {
        EnumSingleton first = EnumSingleton.getInstance();
        EnumSingleton second = EnumSingleton.getInstance();
        Assert.assertSame(first, second);
    }

}
