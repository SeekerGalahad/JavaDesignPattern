package com.design.training.factory;


/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 14:46 by Wagic 创建
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department user) {
        System.out.println("insert department into Access....");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("get department from Access....");
        return null;
    }
}
