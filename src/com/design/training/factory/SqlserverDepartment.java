package com.design.training.factory;


/**
 * @Description:
 * @Date: 2018-12-25 14:49 by Wagic(weibin.wang01@ucarinc.com) 创建
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department user) {
        System.out.println("insert department into Sqlserver....");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("get department from Sqlserver....");
        return null;
    }
}
