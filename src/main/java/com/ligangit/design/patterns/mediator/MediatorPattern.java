package com.ligangit.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者模式
 * @author ligang
 * @date 2024/4/29
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
        System.out.println("--------------------");
        colleague2.send();
    }
}

/**
 * 抽象中介者
 * @author ligang
 * @date 2024/4/29
 */
abstract class Mediator {

    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param colleague
     */
    public abstract void relay(Colleague colleague);


}

/**
 * 具体中介者
 *
 * @author ligang
 * @date 2024/4/29
 */
class ConcreteMediator extends Mediator {

    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }

    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague ob : colleagueList) {
            if (!ob.equals(colleague)) {
                ob.receive();
            }
        }
    }
}
/**
 * 抽象同事类
 * @author ligang
 * @date 2024/4/29
 */
abstract class Colleague {

    protected Mediator mediator;


    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send();

    public abstract void receive();

}

/**
 * 具体同事类
 * @author ligang
 * @date 2024/4/29
 */
class  ConcreteColleague1 extends Colleague {

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
}

/**
 * 具体同事类
 * @author ligang
 * @date 2024/4/29
 */
class  ConcreteColleague2 extends Colleague {

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        // 请中介者转发
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }
}
