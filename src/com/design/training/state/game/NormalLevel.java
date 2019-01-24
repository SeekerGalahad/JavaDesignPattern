package com.design.training.state.game;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 18:25 by Wagic 创建
 */
public class NormalLevel implements Level {
    @Override
    public void play(Role role) {
        if (role.getIntegral() > 40) {
            System.out.println("积分" + role.getIntegral() + "， 升级二级玩家！");
            role.setLevel(new SecondaryLevel());
            role.playGame();
        } else {
            System.out.println("普通玩家,啥技能都没...");
        }
    }
}
