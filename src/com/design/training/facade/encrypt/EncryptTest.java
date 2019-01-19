package com.design.training.facade.encrypt;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-17 14:20 by Wagic 创建
 */
public class EncryptTest {

    public static void main(String[] args) {

        // 考虑使用配置文件加载具体的门面类
        AbstractFacade af = new EncryptFacade();

        af.fileEncrypt("/测试文件源.txt", "/目标文件源.txt");
    }
}
