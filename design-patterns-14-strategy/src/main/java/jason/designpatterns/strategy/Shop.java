package jason.designpatterns.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 商店
 * 环境
 *
 * @author Jason Hou
 */
public class Shop {

    private Discount discount;

    private final List<Commodity> cart = new ArrayList<>();

    public void buy(Commodity commodity) {
        cart.add(commodity);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public BigDecimal getTotal() {
        BigDecimal total = new BigDecimal(0);

        for (Commodity commodity : cart) {
            total = total.add(commodity.getPrice());
        }

        return getDiscount().discount(total);
    }

}
