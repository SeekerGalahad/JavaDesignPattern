package com.design.training.builder.character;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:54 by Wagic 创建
 */
public class AngleBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildFace() {
        actor.setFace("瓜子脸");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("羽翼装");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }
}
