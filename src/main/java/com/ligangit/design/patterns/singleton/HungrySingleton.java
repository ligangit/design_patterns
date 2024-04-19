package com.ligangit.design.patterns.singleton;

/**
 * 饿汉式单例
 * @apiNote 可参考文章：https://zhuanlan.zhihu.com/p/677327799
 *
 * @author ligang
 * @date 2024/4/19
 */
public class HungrySingleton {

    /**
     * 加载 HungrySingleton的时候，就会创建对象
     */
    private static final HungrySingleton instance = new HungrySingleton();


    /**
     * 私有化构造方法，避免类在外部被实例化
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
