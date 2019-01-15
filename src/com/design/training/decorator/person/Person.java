package com.design.training.decorator.person;

/**
 * @author Wagic
 * @Description: 要装饰的对象，通常有一个抽象类，根据具体情况确定
 * @Date: 2019-01-15 14:43 by Wagic 创建
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("初始装扮，光膀子");
    }
}
