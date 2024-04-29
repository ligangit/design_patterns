package com.ligangit.design.patterns.composite;

import java.util.ArrayList;

/**
 * 组合模式---透明模式
 * @author ligang
 * @date 2024/4/29
 */
public class CompositePattern {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component left1 = new Left("1");
        Component left2 = new Left("2");
        Component left3 = new Left("3");
        c0.add(left1);
        c0.add(c1);
        c1.add(left2);
        c1.add(left3);
        c0.operation();
    }
}

/**
 * 抽象构件
 * @author ligang
 * @date 2024/4/29
 */
interface Component {

    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();
}

/**
 * 树叶构件
 * @author ligang
 * @date 2024/4/29
 */
class Left implements Component {

    private String name;

    public Left(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
/**
 * 树枝构件
 * @author ligang
 * @date 2024/4/29
 */
class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>();


    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {

        for (Component child : children) {
            child.operation();
        }
    }
}