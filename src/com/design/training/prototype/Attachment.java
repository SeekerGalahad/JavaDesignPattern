package com.design.training.prototype;

import java.io.Serializable;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 11:14 by Wagic 创建
 */
public class Attachment implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件：" + name);
    }
}
