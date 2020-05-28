package jason.designpatterns.factorymethod.factory;

import jason.designpatterns.factorymethod.product.Product;

/**
 * 抽象工厂
 *
 * @author Jason Hou
 */
public interface AbstractFactory {

    /**
     * 创建产品
     *
     * @return 返回的是一个接口类型，由具体工厂决定返回哪个具体的产品
     */
    Product newProduct();

}
