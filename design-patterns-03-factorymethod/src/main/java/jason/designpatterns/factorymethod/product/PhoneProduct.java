package jason.designpatterns.factorymethod.product;

/**
 * 手机产品
 *
 * @author Jason Hou
 */
public class PhoneProduct implements Product {

    @Override
    public String show() {
        return "手机显示来电话了";
    }

}
