package com.design.training.memento.chess;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-02-02 14:56 by Wagic 创建
 */
public class Chessman {

    private String label;

    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("棋子：" + label + ", 当前位置为：第" + x + "行, 第" + y + "列");
    }

    public ChessmanMemento save() {
        return new ChessmanMemento(label, x, y);
    }

    public void restore(ChessmanMemento chessmanMemento) {
        this.label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
