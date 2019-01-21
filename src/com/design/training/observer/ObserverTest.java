package com.design.training.observer;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-21 15:04 by Wagic 创建
 */
public class ObserverTest {

    public static void main(String[] args) {

        AllyControlCenter acc = new ConcreteAllyControlCenter("Germany Ally Center");

        Observer playerOne = new Player("soldier01");
        Observer playerTwo = new Player("soldier02");
        Observer playerThree = new Player("soldier03");
        Observer playerFour = new Player("soldier04");

        acc.join(playerOne);
        acc.join(playerTwo);
        acc.join(playerThree);
        acc.join(playerFour);

        playerOne.beAttacked(acc);
    }
}
