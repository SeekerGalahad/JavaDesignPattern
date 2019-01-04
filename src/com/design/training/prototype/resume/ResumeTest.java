package com.design.training.prototype.resume;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 13:54 by Wagic 创建
 */
public class ResumeTest {

    public static void main(String[] args) {
        Resume resume = new Resume("test");
        resume.setSex("男");
        WorkExperience workExperience = new WorkExperience();
        workExperience.setCompany("test company");
        workExperience.setWorkDate("1991");
        resume.setExperience(workExperience);

        resume.display();

        try {
            Resume resume1 = resume.clone();
            System.out.println(resume1.equals(resume));
            System.out.println(resume1.getExperience().equals(resume.getExperience()));

            resume1.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
