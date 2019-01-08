package com.design.training.builder.character;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:55 by Wagic 创建
 */
public class ActorDirector {

    public Actor constuct(ActorBuilder ab) {

        Actor actor;
        ab.buildType();
        ab.buildFace();
        if (!ab.isBarehead()) {
            ab.buildHairstyle();
        }
        ab.buildSex();
        ab.buildCostume();
        actor = ab.createActor();
        return actor;
    }
}
