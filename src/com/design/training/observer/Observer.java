package com.design.training.observer;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-21 14:48 by Wagic 创建
 */
public interface Observer {

    String getName();

    void setName(String name);

    void help();

    void beAttacked(AllyControlCenter acc);
}
