package com.design.training.strategy.movie;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-29 17:20 by Wagic   创建
 */
public class VipDiscount implements Discount {
    /**
     * 计算打折
     *
     * @param money
     * @return
     */
    @Override
    public double calculate(double money) {
        System.out.println("会员票：");
        System.out.println("增加积分！！");
        return money * 0.5;
    }
}
