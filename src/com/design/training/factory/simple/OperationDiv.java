package com.design.training.factory.simple;

/**
 * 除法
 * @author Wagic
 */
public class OperationDiv extends Operation {

    @Override
    public Double getResult() {
        if (number2 == 0) {
            return null;
        }
        return (double) (number1 * number2);
    }
}
