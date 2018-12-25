package com.design.training.factory.method.logger;

/**
 * @author Wagic
 * @Description: 日志客户端
 * @Date: 2018-12-25 10:54 by Wagic  创建
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;

        // 可引入xml配置文件实现 + 反射
        factory = new FileLoggerFactory();
        logger = factory.createLogger();

        logger.writeLog();
    }
}
