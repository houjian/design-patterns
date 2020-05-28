package jason.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 促销折扣
 * 具体策略
 *
 * @author Jason Hou
 */
public class PromotionDiscount implements Discount {

    private final BigDecimal rebate = new BigDecimal("0.8");
    private final BigDecimal reduced = new BigDecimal("1");

    @Override
    public BigDecimal discount(BigDecimal price) {
        // 八折减1
        return price.multiply(rebate)
                .subtract(reduced)
                .setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
