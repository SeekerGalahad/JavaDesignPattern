package com.design.training.builder.person;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-08 14:24 by Wagic 创建
 */
public abstract class PersonBuilder {

    protected Graphics g;

    protected Pen p;

    public PersonBuilder(Graphics g, Pen p) {
        this.g = g;
        this.p = p;
    }

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();
}
