package com.design.training.prototype.document;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 14:04 by Wagic 创建
 */
public interface OfficialDocument extends Cloneable {

    OfficialDocument clone();

    void display();
}
