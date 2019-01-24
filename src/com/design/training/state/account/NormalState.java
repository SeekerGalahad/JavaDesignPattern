package com.design.training.state.account;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-24 11:33 by Wagic 创建
 */
public class NormalState extends AccountState {

    public NormalState(Account account) {
        super(account);
    }

    public NormalState(AccountState state) {
        super(state.getAccount());
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() < 0 && acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));

        } else if(acc.getBalance() ==  -2000) {
            acc.setState(new RestrictedState(this));
        } else if(acc.getBalance() <  -2000) {
            System.out.println("操作受限!!");
        }
    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态，无需支付利息！！");
    }

    @Override
    public Account getAccount() {
        return this.acc;
    }
}
