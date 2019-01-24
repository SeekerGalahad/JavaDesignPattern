package com.design.training.state.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-24 11:20 by Wagic 创建
 */
public class Account {

    private AccountState state;

    private String owner;

    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        state = new NormalState(this);
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);
        System.out.println("现在余额为: " + this.balance);
        System.out.println("现在的账户状态为: " + this.state.getClass().getSimpleName());
        System.out.println("------------------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("现在余额为: " + this.balance);
        System.out.println("现在的账户状态为: " + this.state.getClass().getSimpleName());
        System.out.println("------------------------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest();
    }
}
