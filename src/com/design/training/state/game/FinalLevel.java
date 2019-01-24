package com.design.training.state.game;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 18:27 by Wagic 创建
 */
public class FinalLevel implements Level {

    @Override
    public void play(Role role) {
        System.out.println("终级玩家，升到顶级了。");
        peekCards();
    }

    public void peekCards() {
        System.out.println("发动看牌神技");
    }
}
