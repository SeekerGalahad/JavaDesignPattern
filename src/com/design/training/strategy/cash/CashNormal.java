package com.design.training.strategy.cash;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-28 14:27 by Wagic  创建
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
