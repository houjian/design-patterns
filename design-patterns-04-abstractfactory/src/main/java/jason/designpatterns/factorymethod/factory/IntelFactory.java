package jason.designpatterns.factorymethod.factory;

import jason.designpatterns.factorymethod.product.ChipProduct;
import jason.designpatterns.factorymethod.product.IntelChipProduct;
import jason.designpatterns.factorymethod.product.IntelMemoryProduct;
import jason.designpatterns.factorymethod.product.MemoryProduct;

/**
 * 因特尔
 *
 * @author Jason Hou
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public ChipProduct newChipProduct() {
        return new IntelChipProduct();
    }

    @Override
    public MemoryProduct newMemoryProduct() {
        return new IntelMemoryProduct();
    }

}
