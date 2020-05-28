package jason.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 商品
 *
 * @author Jason Hou
 */
public class Commodity {

    private final BigDecimal price;

    public Commodity(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
