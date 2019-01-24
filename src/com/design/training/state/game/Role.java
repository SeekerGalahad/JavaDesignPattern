package com.design.training.state.game;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 18:22 by Wagic 创建
 */
public class Role {

    private Level level;

    private int integral = 0;

    public Role() {
        level = new NormalLevel();
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public void playGame() {
        level.play(this);
    }
}
