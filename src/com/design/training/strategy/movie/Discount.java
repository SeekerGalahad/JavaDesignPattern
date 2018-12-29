package com.design.training.strategy.movie;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-29 17:15 by Wagic  创建
 */
public interface Discount {

    /**
     * 计算打折
     * @param money
     * @return
     */
    double calculate(double money);

}
