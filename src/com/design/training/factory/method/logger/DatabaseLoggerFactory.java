package com.design.training.factory.method.logger;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 10:49 by Wagic 创建
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 连接数据库，代码略
        DatabaseLogger logger = new DatabaseLogger();
        // 写入数据库，代码略
        return logger;
    }
}
