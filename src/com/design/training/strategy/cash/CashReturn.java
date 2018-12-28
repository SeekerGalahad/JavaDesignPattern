package com.design.training.strategy.cash;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-28 14:37 by Wagic  创建
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {

        double result = money;

        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
