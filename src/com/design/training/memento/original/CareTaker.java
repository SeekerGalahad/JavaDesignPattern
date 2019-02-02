package com.design.training.memento.original;

/**
 * @author Wagic
 * @Description: 备忘录管理类，只保存备忘录对象而不修改备忘录对象
 * @Date: 2019-02-02 14:31 by Wagic 创建
 */
public class CareTaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        System.out.println("保存当前的备忘录，当前状态：" + memento.getState());
        this.memento = memento;
    }
}
