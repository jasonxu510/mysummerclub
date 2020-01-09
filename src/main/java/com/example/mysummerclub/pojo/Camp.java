package com.example.mysummerclub.pojo;

public class Camp {
    //夏令营ID
    private Long id;

    private String blanckSpaceOne;

    private String blanckSpaceThree;

    private String blanckSpaceTwo;
    //夏令营相关文件（可下载）
    private String campFileUrl;
    //夏令营名称
    private String campName;
    //夏令营资讯详情
    private String campNewsIfo;
    //夏令营资讯标题
    private String campNewsTitle;
    //夏令营资讯图片链接
    private String campNewsUrl;
    //状态（正在报名，报名结束，默认为正在报名）
    private String campStatus;
    //报名结束时间
    private String endTime;
    //用户ID
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCampFileUrl() {
        return campFileUrl;
    }

    public void setCampFileUrl(String campFileUrl) {
        this.campFileUrl = campFileUrl == null ? null : campFileUrl.trim();
    }

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName == null ? null : campName.trim();
    }

    public String getCampNewsIfo() {
        return campNewsIfo;
    }

    public void setCampNewsIfo(String campNewsIfo) {
        this.campNewsIfo = campNewsIfo == null ? null : campNewsIfo.trim();
    }

    public String getCampNewsTitle() {
        return campNewsTitle;
    }

    public void setCampNewsTitle(String campNewsTitle) {
        this.campNewsTitle = campNewsTitle == null ? null : campNewsTitle.trim();
    }

    public String getCampNewsUrl() {
        return campNewsUrl;
    }

    public void setCampNewsUrl(String campNewsUrl) {
        this.campNewsUrl = campNewsUrl == null ? null : campNewsUrl.trim();
    }

    public String getCampStatus() {
        return campStatus;
    }

    public void setCampStatus(String campStatus) {
        this.campStatus = campStatus == null ? null : campStatus.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}