package com.ligangit.design.patterns.singleton;

/**
 * 懒汉式单例
 * @apiNote 可参考文章：https://zhuanlan.zhihu.com/p/677327799
 *
 * @author ligang
 * @date 2024/4/19
 */
public class LazySingleton {

    /**
     * 实例对象，volatile保证 instance 在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * 私有化构造方法，避免类在外部被实例化
     */
    private LazySingleton() {
    }

    /**
     * getInstance 方法前加同步
     * @apiNote 当第一次加载时创建，注意多线程时的线程安全
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
