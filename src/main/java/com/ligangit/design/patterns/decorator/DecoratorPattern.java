package com.ligangit.design.patterns.decorator;

/**
 * 装饰模式
 * @author ligang
 * @date 2024/4/19
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("--------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
