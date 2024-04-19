package com.ligangit.design.patterns.bridge;

/**
 * 桥接模式
 *
 * @author ligang
 * @date 2024/4/19
 */
public class BirdgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
