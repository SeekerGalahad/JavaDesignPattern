package com.design.training.decorator.graphic;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-15 17:45 by Wagic 创建
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
