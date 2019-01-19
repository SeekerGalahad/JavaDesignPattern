package com.design.training.facade.system;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-17 14:30 by Wagic 创建
 */
public class SystemFacade {

    private SubSystemOne systemOne;
    private SubSystemTwo systemTwo;
    private SubSystemThree systemThree;

    public SystemFacade() {
        systemOne = new SubSystemOne();
        systemTwo = new SubSystemTwo();
        systemThree = new SubSystemThree();
    }

    public void systemBoot() {
        systemOne.systemOneBoot();
        systemTwo.systemTwoBoot();
        systemThree.systemThreeBoot();
        System.out.println("启动完毕......");
    }

    public void shutdown() {
        systemOne.shutdown();
        systemTwo.shutdown();
        systemThree.shutdown();
        System.out.println("所有子系统关闭完毕......");
    }
}
