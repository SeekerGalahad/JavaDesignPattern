package com.design.training.memento.original;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-02-02 14:32 by Wagic 创建
 */
public class MementoTest {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        // 保存旧状态
        careTaker.setMemento(originator.createMemento());

        originator.setState("off");
        originator.show();

        // 还原旧状态
        originator.restoreMemento(careTaker.getMemento());
        originator.show();
    }
}
