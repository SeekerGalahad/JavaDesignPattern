package com.design.training.strategy.cash;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-28 14:33 by Wagic  创建
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
