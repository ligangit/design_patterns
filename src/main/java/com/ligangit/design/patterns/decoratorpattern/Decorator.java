package com.ligangit.design.patterns.decoratorpattern;

/**
 * 抽象装饰角色
 * @author ligang
 * @date 2024/4/19
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
