package com.design.training.strategy.movie;

/**
 * @author Wagic
 * @Description: 电影票类
 * @Date: 2018-12-27 18:20 by Wagic 创建
 */
public class MovieTicket {

    /**
     * 电影票价格
     */
    private double price;

    /**
     * 电影票类型
     */
    private String type;

    /**
     * 打折策略类
     */
    private Discount discount;

    public Discount getDiscount() {
        return discount;
    }

    /**
     * 注入一个打折策略类
     * @param discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        // 调用打折策略类
        return discount.calculate(this.price);
    }
    /*public double getPrice() {
        return price;
    }*/

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


/*
    public double calculate() {
        // 学生票
        if (this.type.equalsIgnoreCase("student")) {
            System.out.println("学生票：");
            return this.price * 0.8;
        } else if (this.type.equalsIgnoreCase("children") && this.price >= 20) {
            System.out.println("儿童票：");
            return this.price * 0.6 - 10;
        } else if (this.type.equalsIgnoreCase("vip")) {
            System.out.println("会员票：");
            System.out.println("增加积分！！");
            return this.price * 0.5;
        } else {
            // 原始票价
            return this.price;
        }
    }*/
}
