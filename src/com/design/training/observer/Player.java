package com.design.training.observer;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-21 14:49 by Wagic 创建
 */
public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(name + ": hold on!!! I will come and help you soon!!!");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(name + ": I'm suffering attack now, help!!!");
        acc.notifyObserver(name);
    }
}
