package com.ligangit.design.patterns.strategy;

import com.ligangit.design.patterns.base.CashNomal;
import com.ligangit.design.patterns.base.CashRebate;
import com.ligangit.design.patterns.base.CashReturn;
import com.ligangit.design.patterns.base.CashSuper;
/**
 * 策略模式
 * @author ligang
 * @date 2024/4/19
 */
public class CashContext {

    private CashSuper cashSuper;

//    /**
//     * 方式一：策略模式
//     * @param cashSuper
//     */
//    public CashContext(CashSuper cashSuper) {
//        this.cashSuper = cashSuper;
//    }


    /**
     * 方式二：策略模式+简单工厂模式结合
     * @param type
     */
    public CashContext(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":{
                cs = new CashNomal();
                break;
            }
            case "满300返100":{
                cs = new CashReturn(300, 100);
                break;
            }
            case "打8折":{
                cs = new CashRebate(0.8);
                break;
            }
            default:{
                throw new IllegalStateException("Unexpected value: " + type);
            }

        }
        this.cashSuper = cs;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
