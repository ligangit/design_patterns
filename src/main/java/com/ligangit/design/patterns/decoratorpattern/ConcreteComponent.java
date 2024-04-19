package com.ligangit.design.patterns.decoratorpattern;

/**
 * 具体构建角色
 * @author ligang
 * @date 2024/4/19
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体的构建角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法operation()");
    }
}
