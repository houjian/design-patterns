package jason.designpatterns.factorymethod.product;

/**
 * 因特尔存储产品
 *
 * @author Jason Hou
 */
public class IntelMemoryProduct implements MemoryProduct {

    @Override
    public String save() {
        return "因特尔存储";
    }

}
