package com.design.training.factory.simple;

/**
 * 加法
 * @author Wagic
 */
public class OperationAdd extends Operation {

    @Override
    public Double getResult() {
        return (double) (number1 + number2);
    }
}
