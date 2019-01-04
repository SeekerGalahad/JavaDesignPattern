package com.design.training.prototype.document;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 14:06 by Wagic 创建
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("<<软件需求规格说明书>>");
    }
}
