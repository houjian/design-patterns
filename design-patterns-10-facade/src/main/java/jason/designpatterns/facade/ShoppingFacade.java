package jason.designpatterns.facade;

import jason.designpatterns.facade.subsystem.CommoditySystem;
import jason.designpatterns.facade.subsystem.OrderSystem;
import jason.designpatterns.facade.subsystem.PaymentSystem;

/**
 * 购物门面
 * 外观角色，为多个子系统对外提供一个共同的接口
 *
 * @author Jason Hou
 */
public class ShoppingFacade {

    private final CommoditySystem commoditySystem = new CommoditySystem();
    private final OrderSystem orderSystem = new OrderSystem();
    private final PaymentSystem paymentSystem = new PaymentSystem();

    public String shop() {
        return commoditySystem.show() + "-" +
                orderSystem.submit() + "-" +
                paymentSystem.pay();
    }

}
