package com.design.training.factory;


/**
 * @Description:
 * @Date: 2018-12-25 15:03 by Wagic 创建
 */
public class DatabaseFactoryTest {

    public static void main(String[] args) {
        AccessFactory accessFactory = new AccessFactory();
        IDepartment department = accessFactory.createDepartment();
        IUser user = accessFactory.createUser();

        user.insert(new User());
        user.getUser(1);

        department.insert(new Department());
        department.getDepartment(1);

        System.out.println("==============Access END===========================");

        SqlserverFactory sqlserverFactory = new SqlserverFactory();
        IDepartment sqlserverFactoryDepartment = sqlserverFactory.createDepartment();
        IUser sqlserverFactoryUser = sqlserverFactory.createUser();

        sqlserverFactoryDepartment.insert(new Department());
        sqlserverFactoryDepartment.getDepartment(1);

        sqlserverFactoryUser.insert(new User());
        sqlserverFactoryUser.getUser(1);

        System.out.println("==============Sqlserver END===========================");
    }
}
