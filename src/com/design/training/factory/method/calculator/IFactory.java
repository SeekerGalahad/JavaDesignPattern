package com.design.training.factory.method.calculator;

import com.design.training.factory.simple.Operation;

/**
 * @author Wagic
 * @Description: 工厂方法-工厂接口类
 * @Date: 2018-12-25 10:34 by Wagic 创建
 */
public interface IFactory {

    Operation createOperation();
}
