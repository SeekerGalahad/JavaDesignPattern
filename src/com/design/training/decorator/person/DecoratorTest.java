package com.design.training.decorator.person;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-15 14:52 by Wagic 创建
 */
public class DecoratorTest {

    public static void main(String[] args) {
        // 初始化两个装饰器
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        // 要装饰的对象
        Person person = new Person();

        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);

        bigTrouser.show();

    }
}
