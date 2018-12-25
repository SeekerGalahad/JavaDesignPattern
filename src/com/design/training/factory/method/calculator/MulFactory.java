package com.design.training.factory.method.calculator;

import com.design.training.factory.simple.Operation;
import com.design.training.factory.simple.OperationMul;

/**
 * @author Wagic
 * @Description: 乘法工厂
 * @Date: 2018-12-25 10:35 by Wagic 创建
 */
public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
