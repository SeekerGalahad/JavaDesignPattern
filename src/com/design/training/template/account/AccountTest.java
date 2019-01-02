package com.design.training.template.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-02 17:11 by Wagic 创建
 */
public class AccountTest {


    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        currentAccount.handle("test", "123456");

        Account savingAccount = new SavingAccount();
        savingAccount.handle("test", "123456");

    }
}
