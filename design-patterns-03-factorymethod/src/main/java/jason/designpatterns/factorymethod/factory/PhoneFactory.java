package jason.designpatterns.factorymethod.factory;

import jason.designpatterns.factorymethod.product.PhoneProduct;
import jason.designpatterns.factorymethod.product.Product;

/**
 * 手机工厂
 *
 * @author Jason Hou
 */
public class PhoneFactory implements AbstractFactory {

    /**
     * 生产手机产品
     */
    @Override
    public Product newProduct() {
        return new PhoneProduct();
    }

}
