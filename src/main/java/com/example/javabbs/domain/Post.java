package com.example.javabbs.domain;


import java.sql.Timestamp;

public class Post {
    private Integer pId;
    private User user;
    private String pTilte;
    private String pContent;
    private Timestamp pCommentTime;

    public Post() {
    }

    public Post(Integer pId, User user, String pTilte, String pContent, Timestamp pCommentTime) {
        this.pId = pId;
        this.user = user;
        this.pTilte = pTilte;
        this.pContent = pContent;
        this.pCommentTime = pCommentTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "pId=" + pId +
                ", user=" + user +
                ", pTilte='" + pTilte + '\'' +
                ", pContent='" + pContent + '\'' +
                ", pCommentTime=" + pCommentTime +
                '}';
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
