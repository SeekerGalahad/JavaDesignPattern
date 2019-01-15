package com.design.training.decorator.graphic;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-15 17:46 by Wagic 创建
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为构件添加黑边！!");
    }
}
