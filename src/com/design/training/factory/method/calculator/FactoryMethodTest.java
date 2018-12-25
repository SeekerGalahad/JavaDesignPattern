package com.design.training.factory.method.calculator;

import com.design.training.factory.simple.Operation;

/**
 * @author Wagic
 * @Description: 工厂方法测试类
 * @Date: 2018-12-25 10:37 by Wagic 创建
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumber1(1);
        operation.setNumber2(2);

        print(1, 2, operation.getResult(), "+");
    }


    private static void print(int num1, int num2, double result, String oper) {
        System.out.println(num1 + oper + num2 + "=" + result);
    }
}
