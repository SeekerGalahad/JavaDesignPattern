package com.design.training.decorator.graphic;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-15 17:46 by Wagic 创建
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("为构件添加滚动条！!");
    }
}
