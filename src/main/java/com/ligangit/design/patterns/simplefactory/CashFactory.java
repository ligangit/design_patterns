package com.ligangit.design.patterns.simplefactory;

import com.ligangit.design.patterns.base.CashNomal;
import com.ligangit.design.patterns.base.CashRebate;
import com.ligangit.design.patterns.base.CashReturn;
import com.ligangit.design.patterns.base.CashSuper;

/**
 * 简单工厂模式
 * @author ligang
 * @date 2024/4/19
 */
public class CashFactory {


    public static CashSuper createCashAdapter(String type) {
        switch (type) {
            case "正常收费":{
                return new CashNomal();
            }
            case "满300返100":{
                return new CashReturn(300, 100);
            }
            case "打8折":{
                return new CashRebate(0.8);
            }
            default:{
                throw new IllegalStateException("Unexpected value: " + type);
            }

        }
    }
}
