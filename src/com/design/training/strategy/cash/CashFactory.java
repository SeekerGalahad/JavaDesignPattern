package com.design.training.strategy.cash;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-28 14:42 by Wagic  创建
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;

        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
            default:
                cs = new CashNormal();
        }

        return cs;
    }

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("打8折");
        System.out.println(cashSuper.acceptCash(10000));
    }
}
