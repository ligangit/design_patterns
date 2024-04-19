package com.ligangit.design.patterns.adapter;

/**
 * 对象结构适配器模式
 *
 * @author ligang
 * @date 2024/4/19
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Adapter adapter = new Adapter();
        Target target = new ObjectAdapter(adapter);
        target.request();
    }

}


/**
 * 对象结构适配器
 * @author ligang
 * @date 2024/4/19
 */
class ObjectAdapter implements Target {

    private Adapter adapter;

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.specificRequest();
    }
}
