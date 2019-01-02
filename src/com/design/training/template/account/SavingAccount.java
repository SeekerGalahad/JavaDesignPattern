package com.design.training.template.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-02 17:10 by Wagic 创建
 */
public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！！");
    }
}
