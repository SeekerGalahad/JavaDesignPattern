package com.design.training.state.work;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 13:48 by Wagic 创建
 */
public class ForenoonState implements State {


    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            System.out.println("当前时间：" + w.getHour() + ", 上午工作，精神百倍");
        } else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
