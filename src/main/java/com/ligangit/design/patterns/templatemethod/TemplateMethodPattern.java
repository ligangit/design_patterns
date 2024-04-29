package com.ligangit.design.patterns.templatemethod;

/**
 * 模板方法模式
 * @author ligang
 * @date 2024/4/29
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}

/**
 * 抽象类
 * @author ligang
 * @date 2024/4/29
 */
abstract class AbstractClass {
    public void TemplateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    /**
     * 具体方法1
     * @apiNote 通用的具体的方法写这
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用。。。");
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();
}

/**
 * 具体子类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用。。。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用。。。");
    }
}