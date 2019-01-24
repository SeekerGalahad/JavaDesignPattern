package com.design.training.state.game;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-23 18:29 by Wagic 创建
 */
public class GameTest {

    public static void main(String[] args) {
        Role role = new Role();
        role.setIntegral(19);
        role.playGame();

        role.setIntegral(32);
        role.playGame();

        role.setIntegral(64);
        role.playGame();

        role.setIntegral(82);
        role.playGame();

        role.setIntegral(93);
        role.playGame();


    }
}
