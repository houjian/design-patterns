package jason.designpatterns.factorymethod.product;

/**
 * 三星存储产品
 *
 * @author Jason Hou
 */
public class SamsungMemoryProduct implements MemoryProduct {

    @Override
    public String save() {
        return "三星存储";
    }

}
