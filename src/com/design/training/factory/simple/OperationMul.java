package com.design.training.factory.simple;

/**
 * 乘法
 * @author Wagic
 */
public class OperationMul extends Operation {

    @Override
    public Double getResult() {
        return (double) (number1 * number2);
    }
}
