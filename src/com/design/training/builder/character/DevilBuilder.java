package com.design.training.builder.character;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:54 by Wagic 创建
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildFace() {
        actor.setFace("粗壮");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑色紧身衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("短发");
    }

    @Override
    public boolean isBarehead() {
        return true;
    }
}
