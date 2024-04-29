package com.ligangit.design.patterns.composite;

import java.util.ArrayList;

/**
 * 组合模式---安全模式
 * @author ligang
 * @date 2024/4/29
 */
public class CompositePatternV2 {
    public static void main(String[] args) {
        CompositeV2 c0 = new CompositeV2();
        CompositeV2 c1 = new CompositeV2();
        ComponentV2 left1 = new LeftV2("1");
        ComponentV2 left2 = new LeftV2("2");
        ComponentV2 left3 = new LeftV2("3");
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
interface ComponentV2 {

    void operation();
}

/**
 * 树叶构件
 * @author ligang
 * @date 2024/4/29
 */
class LeftV2 implements ComponentV2 {

    private String name;

    public LeftV2(String name) {
        this.name = name;
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
class CompositeV2 implements ComponentV2 {

    private ArrayList<ComponentV2> children = new ArrayList<>();



    public void add(ComponentV2 c) {
        children.add(c);
    }


    public void remove(ComponentV2 c) {
        children.remove(c);
    }


    public ComponentV2 getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {

        for (ComponentV2 child : children) {
            child.operation();
        }
    }
}