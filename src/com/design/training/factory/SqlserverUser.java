package com.design.training.factory;


/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 14:46 by Wagic 创建
 */
public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("insert User into Sqlserver....");
    }

    @Override
    public IUser getUser(int id) {
        System.out.println("get User from Sqlserver....");
        return null;
    }
}
