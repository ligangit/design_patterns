package com.ligangit.design.patterns.base;

/**
 * 折扣计算规则工厂
 * @author ligang
 * @date 2024/4/19
 */
public abstract class CashSuper {

    /**
     * 计算折扣
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
