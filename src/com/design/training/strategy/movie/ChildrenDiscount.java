package com.design.training.strategy.movie;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-29 17:20 by Wagic   创建
 */
public class ChildrenDiscount implements Discount {
    /**
     * 计算打折
     *
     * @param money
     * @return
     */
    @Override
    public double calculate(double money) {
        System.out.println("儿童票：");
        return money * 0.6 - 10;
    }
}
