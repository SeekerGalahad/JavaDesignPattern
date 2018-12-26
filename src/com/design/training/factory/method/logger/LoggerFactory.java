package com.design.training.factory.method.logger;

/**
 * @author Wagic
 * @Description: 日志工厂接口
 * @Date: 2018-12-25 10:48 by Wagic  创建
 */
public interface LoggerFactory {

    /**
     * 创建产品类对象，可重载多个方法，以实现不同的业务
     * @return
     */
    Logger createLogger();
}
