package com.ligangit.design.patterns.adapter;

/**
 * 类结构适配器模式
 *
 * @author ligang
 * @date 2024/4/19
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }

}

/**
 * 类结构适配器
 * @author ligang
 * @date 2024/4/19
 */
class ClassAdapter extends Adapter implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
