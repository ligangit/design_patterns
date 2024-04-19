package com.ligangit.design.patterns.decorator;

/**
 * 具体装饰角色
 * @author ligang
 * @date 2024/4/19
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构建角色增加额外的功能addedFunction()");
    }
}
