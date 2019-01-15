package com.design.training.decorator.person;

/**
 * @author Wagic
 * @Description: 装饰类2
 * @Date: 2019-01-15 14:47 by Wagic 创建
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        super.show();
        System.out.println("穿上-大T恤");
    }
}
