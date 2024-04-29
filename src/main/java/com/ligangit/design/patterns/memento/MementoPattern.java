package com.ligangit.design.patterns.memento;

/**
 * 备忘录模式
 *
 * @author ligang
 * @date 2024/4/29
 */
public class MementoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态：" + originator.getState());
        // 保存状态
        caretaker.setMemento(originator.createMemento());
        originator.setState("S1");
        System.out.println("新的状态：" + originator.getState());
        // 恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态：" + originator.getState());
    }
}

/**
 * 备忘录
 * @author ligang
 * @date 2024/4/29
 */
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

/**
 * 发起人
 * @author ligang
 * @date 2024/4/29
 */
class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复状态
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

}

/**
 * 管理者
 * @author ligang
 * @date 2024/4/29
 */
class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}