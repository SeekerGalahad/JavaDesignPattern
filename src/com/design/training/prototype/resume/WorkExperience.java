package com.design.training.prototype.resume;

import java.io.Serializable;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 11:14 by Wagic 创建
 */
public class WorkExperience implements Serializable {

    private String workDate;

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public void download() {
        System.out.println("下载附件：" + workDate);
    }
}
