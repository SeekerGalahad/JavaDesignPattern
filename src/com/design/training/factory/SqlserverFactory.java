package com.design.training.factory;


/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 14:49 by Wagic 创建
 */
public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
