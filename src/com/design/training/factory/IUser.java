package com.design.training.factory;


/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-25 14:35 by Wagic 创建
 */
public interface IUser {

    void insert(User user);

    IUser getUser(int id);
}
