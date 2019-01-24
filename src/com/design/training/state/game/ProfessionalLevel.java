package com.design.training.state.game;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 18:28 by Wagic 创建
 */
public class ProfessionalLevel implements Level {
    @Override
    public void play(Role role) {
        if (role.getIntegral() > 90) {
            System.out.println("积分：" + role.getIntegral() + ", 升级为终级玩家");
            role.setLevel(new FinalLevel());
            role.playGame();
        } else {
            System.out.println("专家玩家，离终级玩家有点距离，加油");
            changeCards();
        }
    }

    public void changeCards() {
        System.out.println("发动换牌神技");
    }
}
