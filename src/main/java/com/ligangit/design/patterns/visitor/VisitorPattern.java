package com.ligangit.design.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 访问者模式
 *
 * @author ligang
 * @date 2024/4/29
 */
public class VisitorPattern {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        objectStructure.accept(visitor);
        System.out.println("---------------");
        visitor = new ConcreteVisitorB();
        objectStructure.accept(visitor);
    }
}

/**
 * 抽象访问者
 * @author ligang
 * @date 2024/4/29
 */
interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}

/**
 * 具体访问者A类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问--->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问--->" + element.operationB());
    }
}

/**
 * 具体访问者B类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问--->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问--->" + element.operationB());
    }

}

/**
 * 抽象元素
 * @author ligang
 * @date 2024/4/29
 */
interface Element {
    void accept(Visitor visitor);
}

/**
 * 具体元素A类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteElementA implements Element{

    public String operationA() {
        return "具体元素A的操作。";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

/**
 * 具体元素B类
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteElementB implements Element{
    public String operationB() {
        return "具体元素B的操作。";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


/**
 * 对象结构角色
 * @author ligang
 * @date 2024/4/29
 */
class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }


}