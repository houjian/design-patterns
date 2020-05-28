package jason.designpatterns.factorymethod;

import jason.designpatterns.factorymethod.factory.AbstractFactory;
import jason.designpatterns.factorymethod.factory.IntelFactory;
import jason.designpatterns.factorymethod.factory.SamsungFactory;
import jason.designpatterns.factorymethod.product.ChipProduct;
import jason.designpatterns.factorymethod.product.MemoryProduct;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class AbstractFactoryTest {

    @Test
    public void testIntelFactory() {
        AbstractFactory factory = new IntelFactory();

        ChipProduct chip = factory.newChipProduct();
        String compute = chip.compute();
        System.out.println(compute);

        MemoryProduct memory = factory.newMemoryProduct();
        String saved = memory.save();
        System.out.println(saved);
    }

    @Test
    public void testSamsungFactory() {
        AbstractFactory factory = new SamsungFactory();

        ChipProduct chip = factory.newChipProduct();
        String compute = chip.compute();
        System.out.println(compute);

        MemoryProduct memory = factory.newMemoryProduct();
        String saved = memory.save();
        System.out.println(saved);
    }

}