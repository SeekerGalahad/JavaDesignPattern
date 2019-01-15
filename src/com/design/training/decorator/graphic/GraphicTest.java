package com.design.training.decorator.graphic;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-15 17:52 by Wagic 创建
 */
public class GraphicTest {
    public static void main(String[] args) {
        Component componentA, componentB,componentC;
        componentA = new Window();
        componentB = new ScrollBarDecorator(componentA);
        componentC = new BlackBorderDecorator(componentB);

        componentC.display();
    }
}
