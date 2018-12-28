package com.design.training.strategy.cash;

/**
 * 商场打折-策略模式-测试类
 * @author Wagic
 * @Description:
 * @Date: 2018-12-27 18:19 by Wagic 创建
 */
public class CashStrategyTest {

    public static void main(String[] args) {
        CashContext cs = null;

        cs = new CashContext(new CashNormal());
        double result = cs.getResult(1000);

        System.out.println("不打折:" + result);

        cs = new CashContext(new CashRebate(0.8));
        result = cs.getResult(1000);

        System.out.println("打八折: " + result);

        cs = new CashContext(new CashReturn(300, 100));
        result = cs.getResult(1000);

        System.out.println("满300减100：" + result);

    }
}
