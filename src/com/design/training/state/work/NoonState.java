package com.design.training.state.work;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 13:52 by Wagic 创建
 */
public class NoonState implements State {


    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.out.println("当前时间：" + w.getHour() + ", 中午睡个觉吧");
        } else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
