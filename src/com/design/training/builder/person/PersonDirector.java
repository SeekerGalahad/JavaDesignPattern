package com.design.training.builder.person;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:27 by Wagic 创建
 */
public class PersonDirector {

    private  PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
