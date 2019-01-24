package com.design.training.state.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-24 17:44 by Wagic 创建
 */
public class AccountTest {

    public static void main(String[] args) {
        Account acc = new Account("dalao", 0.0d);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}
