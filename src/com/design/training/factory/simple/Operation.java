package com.design.training.factory.simple;

/**
 * 抽象产品类
 * @author Wagic
 */
public abstract class Operation {

    double number1;

    double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public abstract Double getResult();


    /*public static Operation createOperation(String operator) {
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
    }*/
}
