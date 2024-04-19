package com.ligangit.design.patterns.bridge;

/**
 * 具体实现化角色
 * @author ligang
 * @date 2024/4/19
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现化（Concrete Implementor）角色被访问");
    }
}
