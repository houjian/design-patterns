package jason.designpatterns.factorymethod.factory;

import jason.designpatterns.factorymethod.product.ComputerProduct;
import jason.designpatterns.factorymethod.product.Product;

/**
 * 计算机工厂
 *
 * @author Jason Hou
 */
public class ComputerFactory implements AbstractFactory {

    /**
     * 生产计算机产品
     */
    @Override
    public Product newProduct() {
        return new ComputerProduct();
    }

}
