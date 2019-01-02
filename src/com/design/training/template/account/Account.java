package com.design.training.template.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-02 16:54 by Wagic 创建
 */
public abstract class Account {

    public abstract void calculateInterest();

    public void display() {
        System.out.println("显示利息！");
    }

    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);

        return account.equals("test") && password.equals("123456");
    }

    public void handle(String account, String password) {

        if (!validate(account, password)) {
            System.out.println("账号或者密码错误！！");
            return;
        }

        calculateInterest();

        display();
    }
}
