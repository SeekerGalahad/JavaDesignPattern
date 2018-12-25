package com.design.training.factory.method.logger;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 10:49 by Wagic 创建
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 创建文件日志记录器对象
        FileLogger logger = new FileLogger();
        // 创建文件，写入文件，代码略
        return logger;
    }
}
