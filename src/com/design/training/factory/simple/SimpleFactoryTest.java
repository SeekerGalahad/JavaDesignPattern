package com.design.training.factory.simple;

/**
 * 简单工厂测试类
 * @author Wagic
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumber1(1);
        operation.setNumber2(2);

        print(1, 2, operation.getResult(), "+");

        operation = OperationFactory.createOperation("-");
        operation.setNumber1(19);
        operation.setNumber2(5);

        print(19, 5, operation.getResult(), "-");

        operation = OperationFactory.createOperation("*");
        operation.setNumber1(6);
        operation.setNumber2(7);

        print(6, 7, operation.getResult(), "*");

        operation = OperationFactory.createOperation("/");
        operation.setNumber1(12);
        operation.setNumber2(2);

        print(12, 2, operation.getResult(), "/");
    }

    private static void print(int num1, int num2, double result, String oper) {
        System.out.println(num1 + oper + num2 + "=" + result);
    }
}
