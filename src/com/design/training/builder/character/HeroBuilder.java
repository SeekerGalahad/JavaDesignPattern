package com.design.training.builder.character;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:54 by Wagic 创建
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildFace() {
        actor.setFace("肥脸");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("小平头");
    }
}
