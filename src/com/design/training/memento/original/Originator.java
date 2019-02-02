package com.design.training.memento.original;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-02-02 14:27 by Wagic 创建
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("创建备忘录，当前状态：" + state);
        return new Memento(this);
    }

    public void restoreMemento(Memento memento) {
        System.out.println("还原备忘录里面的状态，目标状态：" + memento.getState());
        this.state = memento.getState();
    }

    public void show() {
        System.out.println("state = " + state);
    }
}
