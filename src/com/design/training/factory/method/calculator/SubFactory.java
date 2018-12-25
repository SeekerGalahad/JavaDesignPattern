package com.design.training.factory.method.calculator;

import com.design.training.factory.simple.Operation;
import com.design.training.factory.simple.OperationSub;

/**
 * @author Wagic
 * @Description: 减法工厂
 * @Date: 2018-12-25 10:35 by Wagic 创建
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
