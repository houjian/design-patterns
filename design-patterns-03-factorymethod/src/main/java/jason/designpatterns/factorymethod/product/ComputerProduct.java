package jason.designpatterns.factorymethod.product;

/**
 * 计算机产品
 *
 * @author Jason Hou
 */
public class ComputerProduct implements Product {

    @Override
    public String show() {
        return "计算机显示来消息了";
    }

}
