package jason.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 折扣策略接口
 * 抽象策略，各种不同的算法以不同的方式实现这个接口
 *
 * @author Jason Hou
 */
public interface Discount {

    /**
     * 打折方法
     *
     * @param price 原价
     * @return 打折价
     */
    BigDecimal discount(BigDecimal price);

}
