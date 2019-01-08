package com.design.training.builder.person;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:15 by Wagic 创建
 */
public class BuildPersonTest {

    public static void main(String[] args) {
        Pen yellow = new Pen("Yellow");
        PersonThinBuilder ptb = new PersonThinBuilder(new Graphics(), yellow);
        PersonDirector personDirector = new PersonDirector(ptb);

        personDirector.createPerson();
    }
}
