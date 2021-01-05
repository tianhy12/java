package com.example.javabbs.domain;

import java.sql.Timestamp;

public class User {
    private Integer uId;
    private String uName;
    private Sex sex;
    private Jurisdiction jurisdiction;
    private Integer  uPostCount;
    private Integer  uCommentCount;
    private Timestamp uRegisterTime;
    private String uIntroduceBirefly;

    public User() {

    }



    public User(Integer uId) {
        this.uId = uId;
    }

    public User(Integer uId, String uName, Integer uPostCount, Integer uCommentCount) {
        this.uId = uId;
        this.uName = uName;
        this.uPostCount = uPostCount;
        this.uCommentCount = uCommentCount;
    }

    public User(Integer uId, String uName, Sex sex, Jurisdiction jurisdiction, Integer uPostCount, Integer uCommentCount, Timestamp uRegisterTime, String uIntroduceBirefly) {
        this.uId = uId;
        this.uName = uName;
        this.sex = sex;
        this.jurisdiction = jurisdiction;
        this.uPostCount = uPostCount;
        this.uCommentCount = uCommentCount;
        this.uRegisterTime = uRegisterTime;
        this.uIntroduceBirefly = uIntroduceBirefly;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Integer getuPostCount() {
        return uPostCount;
    }

    public void setuPostCount(Integer uPostCount) {
        this.uPostCount = uPostCount;
    }

    public Integer getuCommentCount() {
        return uCommentCount;
    }

    public void setuCommentCount(Integer uCommentCount) {
        this.uCommentCount = uCommentCount;
    }

    public Timestamp getuRegisterTime() {
        return uRegisterTime;
    }

    public void setuRegisterTime(Timestamp uRegisterTime) {
        this.uRegisterTime = uRegisterTime;
    }

    public String getuIntroduceBirefly() {
        return uIntroduceBirefly;
    }

    public void setuIntroduceBirefly(String uIntroduceBirefly) {
        this.uIntroduceBirefly = uIntroduceBirefly;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", sex=" + sex +
                ", jurisdiction=" + jurisdiction +
                ", uPostCount=" + uPostCount +
                ", uCommentCount=" + uCommentCount +
                ", uRegisterTime=" + uRegisterTime +
                ", uIntroduceBirefly='" + uIntroduceBirefly + '\'' +
                '}';
    }
}
