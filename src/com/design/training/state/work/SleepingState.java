package com.design.training.state.work;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 13:59 by Wagic 创建
 */
public class SleepingState implements State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + ", 睡觉吧，够命要紧");
    }
}
