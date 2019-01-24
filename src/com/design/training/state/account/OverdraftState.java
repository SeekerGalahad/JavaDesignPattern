package com.design.training.state.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-24 11:33 by Wagic 创建
 */
public class OverdraftState extends AccountState {

    public OverdraftState(Account account) {
        super(account);
    }

    public OverdraftState(AccountState state) {
        super(state.getAccount());
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        } else if(acc.getBalance() ==  -2000) {
            acc.setState(new RestrictedState(this));
        } else if(acc.getBalance() < -2000) {
            System.out.println("操作受限!!");
        }
    }

    @Override
    public void computeInterest() {
        System.out.println("账户透支，计算利息！");
    }

}
