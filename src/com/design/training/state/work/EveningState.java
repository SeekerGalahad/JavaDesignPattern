package com.design.training.state.work;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 13:57 by Wagic 创建
 */
public class EveningState implements State {
    @Override
    public void writeProgram(Work w) {

        if (w.isFinished()) {
            System.out.println("任务完成，休息吧");
            w.writeProgram();
        } else {
            if (w.getHour() < 21) {
                System.out.println("当前时间：" + w.getHour() + ", 加班哦，累死了");
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
