package com.design.training.factory;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 14:34 by Wagic 创建
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
