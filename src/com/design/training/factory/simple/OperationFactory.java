package com.design.training.factory.simple;

/**
 * 工厂类，也可以将静态方法转移至抽象产品类
 * @author Wagic
 */
public class OperationFactory {

    public static Operation createOperation(String operator) {
        Operation operation = null;

        switch (operator) {
            case "+" :
                operation = new OperationAdd();
                break;
            case "-" :
                operation = new OperationSub();
                break;
            case "*" :
                operation = new OperationMul();
                break;
            case "/" :
                operation = new OperationDiv();
                break;
            default:

        }

        return operation;
    }
}
