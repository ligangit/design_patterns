package com.ligangit.design.patterns.base;

/**
 * 打折
 * @author ligang
 * @date 2024/4/19
 */
public class CashRebate extends CashSuper {

    private double rebate = 1d;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
