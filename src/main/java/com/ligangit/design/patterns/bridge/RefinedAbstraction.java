package com.ligangit.design.patterns.bridge;

/**
 * 扩展抽象化角色
 * @author ligang
 * @date 2024/4/19
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化（Refined Abstraction）角色被访问");
        implementor.operationImpl();
    }
}
