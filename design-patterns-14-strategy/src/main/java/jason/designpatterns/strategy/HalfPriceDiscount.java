package jason.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 半价折扣
 * 具体策略
 *
 * @author Jason Hou
 */
public class HalfPriceDiscount implements Discount {

    private final BigDecimal rebate = new BigDecimal(2);

    @Override
    public BigDecimal discount(BigDecimal price) {
        // 半价
        return price.divide(rebate, 2, BigDecimal.ROUND_HALF_UP);
    }

}
