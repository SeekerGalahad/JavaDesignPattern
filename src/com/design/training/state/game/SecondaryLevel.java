package com.design.training.state.game;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 18:26 by Wagic 创建
 */
public class SecondaryLevel implements Level {
    @Override
    public void play(Role role) {
        if (role.getIntegral() > 70) {
            System.out.println("积分：" + role.getIntegral() + ", 升级为专家玩家");
            role.setLevel(new ProfessionalLevel());
            role.playGame();
        } else {
            System.out.println("二级玩家，离专家玩家有点距离，加油");
            doubleScore();
        }
    }

    public void doubleScore() {
        System.out.println("发动技能，积分翻倍");
    }
}
