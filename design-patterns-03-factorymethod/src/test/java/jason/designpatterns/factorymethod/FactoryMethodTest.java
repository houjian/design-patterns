package jason.designpatterns.factorymethod;

import jason.designpatterns.factorymethod.factory.AbstractFactory;
import jason.designpatterns.factorymethod.factory.ComputerFactory;
import jason.designpatterns.factorymethod.factory.PhoneFactory;
import jason.designpatterns.factorymethod.product.Product;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class FactoryMethodTest {

    @Test
    public void testComputerFactory() {
        AbstractFactory factory = new ComputerFactory();
        Product product = factory.newProduct();
        String text = product.show();
        System.out.println(text);
    }

    @Test
    public void testPhoneFactory() {
        AbstractFactory factory = new PhoneFactory();
        Product product = factory.newProduct();
        String text = product.show();
        System.out.println(text);
    }

}
