package com.ligangit.design.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 * @author ligang
 * @date 2024/4/29
 */
public class IteratorPattern {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("北京大学");
        aggregate.add("华南理工");
        aggregate.add("清华大学");
        System.out.print("聚合的内容有：");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next.toString() + "\t");
        }
        Object first = iterator.first();
        System.out.println("\nFirst：" + first.toString());
    }
}


/**
 * 抽象聚合
 * @author ligang
 * @date 2024/4/29
 */
interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}

/**
 * 具体聚合
 *
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();


    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list) ;
    }
}

/**
 * 抽象迭代器
 * @author ligang
 * @date 2024/4/29
 */
interface Iterator {

    Object first();

    Object next();

    boolean hasNext();

}

/**
 * 具体迭代器
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteIterator implements Iterator {

    private List<Object> list = null;

    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        }
        return false;
    }
}
