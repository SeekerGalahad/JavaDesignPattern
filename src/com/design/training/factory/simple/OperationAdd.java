package com.design.training.factory.simple;

public class OperationAdd extends Operation {

    @Override
    public Double getResult() {
        return (double) (number1 + number2);
    }
}
