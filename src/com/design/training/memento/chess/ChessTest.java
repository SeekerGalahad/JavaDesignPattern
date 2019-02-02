package com.design.training.memento.chess;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-02-02 15:05 by Wagic 创建
 */
public class ChessTest {

    public static void main(String[] args) {
        MementoCareTaker mementoCareTaker = new MementoCareTaker();

        Chessman chessman = new Chessman("车", 1, 1);
        chessman.display();
        mementoCareTaker.setChessmanMemento(chessman.save());

        chessman.setY(4);
        chessman.display();
        mementoCareTaker.setChessmanMemento(chessman.save());

        chessman.setX(5);
        chessman.display();

        System.out.println("********************悔棋*******************");
        chessman.restore(mementoCareTaker.getChessmanMemento());
        chessman.display();
    }
}
