package com.design.training.state.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-24 11:21 by Wagic 创建
 */
public abstract class AccountState {

    protected Account acc;

    protected AccountState(Account account) {
        acc = account;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    public abstract void stateCheck();

    public abstract void computeInterest();

    public Account getAccount(){
        return this.acc;
    }

}
