package com.ligangit.design.patterns.base;

/**
 * 满减
 * @author ligang
 * @date 2024/4/19
 */
public class CashReturn extends CashSuper {
    /**
     * 满足多少元
     */
    private double moneyCondition = 0.0d;
    /**
     * 减免多少元
     */
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            // 满减，可能有多次满减
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
