package com.design.training.memento.original;

/**
 * @author Wagic
 * @Description: 备忘录类，保存对应的状态，只提供获取方法与构造器方法
 * @Date: 2019-02-02 14:28 by Wagic 创建
 */
public class Memento {

    private String state;

    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }
}
