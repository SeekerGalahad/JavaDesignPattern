package com.design.training.observer;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-21 14:46 by Wagic 创建
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        super(allyName);
    }

    @Override
    void notifyObserver(String name) {
        System.out.println("Attention, attention!!! " + name + " having been attacking by enemy now!!");
        for (Observer player : players) {
            if (!player.getName().equalsIgnoreCase(name)) {
                player.help();
            }
        }
    }
}
