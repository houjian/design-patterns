package jason.designpatterns.factorymethod.factory;

import jason.designpatterns.factorymethod.product.ChipProduct;
import jason.designpatterns.factorymethod.product.MemoryProduct;

/**
 * 抽象工厂
 * 与工厂方法的区别是多个产品簇
 *
 * @author Jason Hou
 */
public interface AbstractFactory {

    /**
     * 创建芯片产品
     *
     * @return 芯片
     */
    ChipProduct newChipProduct();

    /**
     * 创建内存产品
     *
     * @return 内存
     */
    MemoryProduct newMemoryProduct();

}
