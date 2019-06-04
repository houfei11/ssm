package com.imooc.entity;

import java.util.Date;

public class Personal {

    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private String school;
    private Date stuTime;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getStuTime() {
        return stuTime;
    }

    public void setStuTime(Date stuTime) {
        this.stuTime = stuTime;
    }
}
