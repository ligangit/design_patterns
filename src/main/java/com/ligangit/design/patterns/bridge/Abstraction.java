package com.ligangit.design.patterns.bridge;

/**
 * 抽象化角色
 * @author ligang
 * @date 2024/4/19
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
