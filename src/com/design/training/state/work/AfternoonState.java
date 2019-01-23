package com.design.training.state.work;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 13:56 by Wagic 创建
 */
public class AfternoonState implements State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17) {
            System.out.println("当前时间：" + w.getHour() + ", 下午状态还行，继续努力");
        } else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
