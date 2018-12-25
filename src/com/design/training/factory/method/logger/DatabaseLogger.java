package com.design.training.factory.method.logger;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 10:51 by Wagic 创建
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
