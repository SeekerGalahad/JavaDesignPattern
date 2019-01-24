package com.design.training.state.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-24 11:33 by Wagic 创建
 */
public class RestrictedState extends AccountState {


    public RestrictedState(AccountState state) {
        super(state.getAccount());
    }

    public RestrictedState(Account account) {
        super(account);
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        } else if(acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));
        }
    }

    @Override
    public void computeInterest() {
        System.out.println("账户受限，计算利息");
    }
}
