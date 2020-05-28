package jason.designpatterns.facade;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class FacadeTest {

    @Test
    public void testFacade() {
        ShoppingFacade facade = new ShoppingFacade();
        String result = facade.shop();
        System.out.println(result);
    }

}
