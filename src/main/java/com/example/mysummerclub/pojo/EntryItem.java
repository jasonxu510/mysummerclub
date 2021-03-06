package com.example.mysummerclub.pojo;

public class EntryItem {
    //报名记录ID
    private Long id;
    //年龄
    private Integer age;

    private String blanckSpaceOne;

    private String blanckSpaceThree;

    private String blanckSpaceTwo;
    //夏令营名称
    private Integer campHeadCount;
    //夏令营ID
    private Long campId;
    //报名者姓名
    private String givenName;
    //学生成绩
    private String grades;
    //所在学校
    private String grammerSchool;
    //手机号
    private String phoneNumber;
    //性别
    private String sex;
    //审核状态
    private String status;
    //报名者ID
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBlanckSpaceOne() {
        return blanckSpaceOne;
    }

    public void setBlanckSpaceOne(String blanckSpaceOne) {
        this.blanckSpaceOne = blanckSpaceOne == null ? null : blanckSpaceOne.trim();
    }

    public String getBlanckSpaceThree() {
        return blanckSpaceThree;
    }

    public void setBlanckSpaceThree(String blanckSpaceThree) {
        this.blanckSpaceThree = blanckSpaceThree == null ? null : blanckSpaceThree.trim();
    }

    public String getBlanckSpaceTwo() {
        return blanckSpaceTwo;
    }

    public void setBlanckSpaceTwo(String blanckSpaceTwo) {
        this.blanckSpaceTwo = blanckSpaceTwo == null ? null : blanckSpaceTwo.trim();
    }

    public Integer getCampHeadCount() {
        return campHeadCount;
    }

    public void setCampHeadCount(Integer campHeadCount) {
        this.campHeadCount = campHeadCount;
    }

    public Long getCampId() {
        return campId;
    }

    public void setCampId(Long campId) {
        this.campId = campId;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName == null ? null : givenName.trim();
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades == null ? null : grades.trim();
    }

    public String getGrammerSchool() {
        return grammerSchool;
    }

    public void setGrammerSchool(String grammerSchool) {
        this.grammerSchool = grammerSchool == null ? null : grammerSchool.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}