package com.design.training.strategy.movie;

/**
 * @author Wagic
 * @Description: 电影票-策略模式-测试类
 * @Date: 2018-12-29 16:57 by Wagic  创建
 */
public class MovieStrategyTest {

    public static void main(String[] args) {
       /* MovieTicket mt = new MovieTicket();
        mt.setPrice(10000);
        mt.setType("student");
        System.out.println("原始价格：" + 10000);

        System.out.println(mt.calculate());

        mt.setType("children");

        System.out.println(mt.calculate());

        mt.setType("vip");

        System.out.println(mt.calculate());*/
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(100);
        System.out.println("原始票价：" + 100);

        StudentDiscount student = new StudentDiscount();
        movieTicket.setDiscount(student);
        System.out.println(movieTicket.getPrice());

        ChildrenDiscount children = new ChildrenDiscount();
        movieTicket.setDiscount(children);
        System.out.println(movieTicket.getPrice());

        VipDiscount vip = new VipDiscount();
        movieTicket.setDiscount(vip);
        System.out.println(movieTicket.getPrice());


    }
}
