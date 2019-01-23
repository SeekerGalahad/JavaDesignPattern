package com.design.training.state.work;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 13:46 by Wagic 创建
 */
public class Work {

    private State current;

    private int hour;

    private boolean finished;

    public Work() {
        // 初始工作状态
        current = new ForenoonState();
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void setState(State current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
