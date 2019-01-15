package com.design.training.decorator.person;

/**
 * @author Wagic
 * @Description:  装饰类1
 * @Date: 2019-01-15 14:50 by Wagic 创建
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("穿上-垮裤");
    }
}
