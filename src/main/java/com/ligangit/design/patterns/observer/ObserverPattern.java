package com.ligangit.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 *
 * @author ligang
 * @date 2024/4/29
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}

/**
 * 抽象目标
 * @author ligang
 * @date 2024/4/29
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     * @param observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}

/**
 * 具体目标
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变");
        System.out.println("-----------------");
        for (Observer observer : observers) {
            // 如果response中调用了notifyObserver()，则会导致循环引用，这是缺点
            observer.response();
        }
    }
}

/**
 * 抽象观察着
 * @author ligang
 * @date 2024/4/29
 */
abstract class Observer {

    /**
     * 反应
     */
    public abstract void response();
}

class ConcreteObserver1 extends Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}

class ConcreteObserver2 extends Observer {

    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}