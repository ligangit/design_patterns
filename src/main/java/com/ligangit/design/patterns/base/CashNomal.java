package com.ligangit.design.patterns.base;

/**
 * 正常
 * @author ligang
 * @date 2024/4/19
 */
public class CashNomal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }

}
