package com.design.training.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-21 14:41 by Wagic 创建
 */
public abstract class AllyControlCenter {

    private String allyName;

    protected List<Observer> players = new ArrayList<>();


    public AllyControlCenter(String allyName) {
        System.out.println("Create AllyCenter......");
        this.allyName = allyName;
        System.out.println("----------------------------------------------------");
    }

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer player) {
        System.out.println(player.getName() + " join " + allyName);
        players.add(player);
    }

    public void quit(Observer player) {
        System.out.println(player.getName() + " leave " + allyName);
        players.remove(player);
    }

    abstract void notifyObserver(String name);
}
