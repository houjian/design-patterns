package jason.designpatterns.strategy;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author Jason Hou
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        Shop shop = new Shop();
        shop.buy(new Commodity(new BigDecimal("1.51")));
        shop.buy(new Commodity(new BigDecimal("3.96")));
        shop.buy(new Commodity(new BigDecimal("2.12")));

        shop.setDiscount(new HalfPriceDiscount());
        BigDecimal halfPrice = shop.getTotal();
        System.out.println(halfPrice);

        shop.setDiscount(new PromotionDiscount());
        BigDecimal promotionPrice = shop.getTotal();
        System.out.println(promotionPrice);
    }

}
