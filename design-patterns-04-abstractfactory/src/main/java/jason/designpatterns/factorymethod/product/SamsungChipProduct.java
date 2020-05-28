package jason.designpatterns.factorymethod.product;

/**
 * 三星芯片产品
 *
 * @author Jason Hou
 */
public class SamsungChipProduct implements ChipProduct {

    @Override
    public String compute() {
        return "三星手机处理器";
    }

}
