package com.example.javabbs.domain;


import java.sql.Timestamp;

public class Post {
    private Integer pId;
    private Integer uId;
    private String pTilte;
    private String pContent;
    private Timestamp pCommentTime;
    private User user;


    public Post() {
    }



    public Post(Integer pId, Integer uId, String pTilte, String pContent, Timestamp pCommentTime, User user) {
        this.pId = pId;
        this.uId = uId;
        this.pTilte = pTilte;
        this.pContent = pContent;
        this.pCommentTime = pCommentTime;
        this.user = user;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getpTilte() {
        return pTilte;
    }

    public void setpTilte(String pTilte) {
        this.pTilte = pTilte;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public Timestamp getpCommentTime() {
        return pCommentTime;
    }

    public void setpCommentTime(Timestamp pCommentTime) {
        this.pCommentTime = pCommentTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "pId=" + pId +
                ", uId=" + uId +
                ", pTilte='" + pTilte + '\'' +
                ", pContent='" + pContent + '\'' +
                ", pCommentTime=" + pCommentTime +
                ", user=" + user +
                '}';
    }
}
