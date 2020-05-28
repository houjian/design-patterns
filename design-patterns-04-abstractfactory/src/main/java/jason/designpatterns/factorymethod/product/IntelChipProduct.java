package jason.designpatterns.factorymethod.product;

/**
 * 因特尔芯片产品
 *
 * @author Jason Hou
 */
public class IntelChipProduct implements ChipProduct {

    @Override
    public String compute() {
        return "因特尔酷睿处理器";
    }

}
