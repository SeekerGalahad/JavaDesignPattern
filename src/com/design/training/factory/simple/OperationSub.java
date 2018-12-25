package com.design.training.factory.simple;

/**
 * 减法
 * @author Wagic
 */
public class OperationSub extends Operation {

    @Override
    public Double getResult() {
        return (double) (number1 - number2);
    }
}
