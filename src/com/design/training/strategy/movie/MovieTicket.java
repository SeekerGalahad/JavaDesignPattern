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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
