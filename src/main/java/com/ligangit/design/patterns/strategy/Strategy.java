package com.ligangit.design.patterns.strategy;

import com.ligangit.design.patterns.base.CashNomal;
import com.ligangit.design.patterns.base.CashRebate;
import com.ligangit.design.patterns.base.CashReturn;
import com.ligangit.design.patterns.base.CashSuper;
import com.ligangit.design.patterns.simplefactory.CashFactory;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 简单工厂使用
 * @author ligang
 * @date 2024/4/19
 */
public class Strategy {

    public static void main(String[] args) {
        double totalCost = 0d;
        Scanner scanner = new Scanner(System.in);

        String quitFlag = "y";
        while ("y".equals(quitFlag)) {
            System.out.println("请输入商品单价：");
            String priceString = scanner.next();
            double price = Double.parseDouble(priceString);
            System.out.print("请输入商品数量：");
            String quantityString = scanner.next();
            double quantity = Double.parseDouble(quantityString);
            System.out.println("请选择折扣方式（输入数字即可）：");
            TreeMap<String, String> type = new TreeMap<>();
            type.put("1", "正常收费");
            type.put("2", "满300返100");
            type.put("3", "打8折");
            for (Map.Entry<String, String> entry : type.entrySet()) {
                System.out.println(entry.getKey() + "、" + entry.getValue());
            }
            String discountText = scanner.next();
            // 简单工厂模式
            // 1、需要知道两个类：CashSuper、CashFactory
//            CashSuper cashAdapter = CashFactory.createCashAdapter(type.get(discountText));
//            // 计算费用并应用折扣
//            double cost = cashAdapter.acceptCash(price * quantity);

            // 策略模式----相对来讲，解耦，耦合度更低，主要是减少使用算法之间的耦合性
            // 1、需要知道一个类：CashContext
            CashContext cashContext = new CashContext(type.get(discountText));

            double cost = cashContext.getResult(price * quantity);
            totalCost = totalCost + cost;
            System.out.println("单价：" + priceString + " 数量：" + quantityString + " 折扣" + type.get(discountText) + " 费用：" + cost);
            System.out.println("当前总计：" + totalCost);
            System.out.println("继续输入商品（y/n）：");
            quitFlag = scanner.next();
        }
        System.out.println("已退出计算，最终总价为：" + totalCost);

    }
}
