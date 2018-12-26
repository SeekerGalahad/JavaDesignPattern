package com.design.training.factory.method.logger;

/**
 * @author Wagic
 * @Description: 将工厂方法的工厂接口改为抽象类所有具体的工厂类可继承此类
 * @Date: 2018-12-25 11:04 by Wagic 创建
 */
public abstract class AbstractFactory {

    /**
     * 直接在抽象类封装产品类的方法
     * 达到隐藏实现细节的目的
     */
    public void writeLog() {
        Logger logger = createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();
}
