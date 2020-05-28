package jason.designpatterns.factorymethod.factory;

import jason.designpatterns.factorymethod.product.ChipProduct;
import jason.designpatterns.factorymethod.product.MemoryProduct;
import jason.designpatterns.factorymethod.product.SamsungChipProduct;
import jason.designpatterns.factorymethod.product.SamsungMemoryProduct;

/**
 * 三星
 *
 * @author Jason Hou
 */
public class SamsungFactory implements AbstractFactory {

    @Override
    public ChipProduct newChipProduct() {
        return new SamsungChipProduct();
    }

    @Override
    public MemoryProduct newMemoryProduct() {
        return new SamsungMemoryProduct();
    }

}
