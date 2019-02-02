package com.design.training.memento.chess;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-02-02 15:03 by Wagic 创建
 */
public class MementoCareTaker {

    private ChessmanMemento chessmanMemento;

    public ChessmanMemento getChessmanMemento() {
        return chessmanMemento;
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento = chessmanMemento;
    }
}
