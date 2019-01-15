package com.design.training.decorator.person;

/**
 * @author Wagic
 * @Description: 继承要装饰的对象，用组合的方式进行复用、功能扩展
 * @Date: 2019-01-15 14:45 by Wagic 创建
 */
public class Finery extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}
