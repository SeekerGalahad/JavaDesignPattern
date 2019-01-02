package com.design.training.template.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-02 17:09 by Wagic 创建
 */
public class CurrentAccount extends Account {

    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
