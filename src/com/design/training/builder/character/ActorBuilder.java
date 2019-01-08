package com.design.training.builder.character;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:48 by Wagic 创建
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    Actor createActor() {
        return actor;
    }

    public abstract void buildType();
    public abstract void buildFace();
    public abstract void buildSex();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public boolean isBarehead() {
        return false;
    }


    /*public static Actor constuct(ActorBuilder ab) {

        ab.buildType();
        ab.buildFace();
        ab.buildHairstyle();
        ab.buildSex();
        ab.buildCostume();
        return actor;
    }*/
}
