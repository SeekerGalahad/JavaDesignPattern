package com.design.training.prototype.resume;

/**
 * @Description:
 * @Date: 2019-01-04 13:49 by Wagic  创建
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    private WorkExperience experience;

    public Resume(String name) {
        this.name = name;
    }

    public WorkExperience getExperience() {
        return experience;
    }

    public void setExperience(WorkExperience experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void display() {
        System.out.println(super.toString());
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }
}
