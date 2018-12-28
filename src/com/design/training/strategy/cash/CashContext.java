package com.design.training.strategy.cash;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-28 14:19 by Wagic  创建
 */
public class CashContext {

    private CashSuper cs;


    public CashContext(CashSuper cs) {
        this.cs = cs;
    }


    public double getResult (double money) {
        return cs.acceptCash(money);
    }
}
