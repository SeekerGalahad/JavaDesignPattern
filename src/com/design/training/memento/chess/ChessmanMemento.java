package com.design.training.memento.chess;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-02-02 14:58 by Wagic 创建
 */
public class ChessmanMemento {

    private String label;

    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }


    public String getLabel() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
