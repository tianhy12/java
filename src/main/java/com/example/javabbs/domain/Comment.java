package com.example.javabbs.domain;

import java.sql.Timestamp;

public class Comment {
    private Integer cId;
    private Post post;
    private String cContent;
    private Timestamp cCommentTime;

    public Comment() {
    }

    public Comment(Integer cId, Post post, String cContent, Timestamp cCommentTime) {
        this.cId = cId;
        this.post = post;
        this.cContent = cContent;
        this.cCommentTime = cCommentTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cId=" + cId +
                ", post=" + post +
                ", cContent='" + cContent + '\'' +
                ", cCommentTime=" + cCommentTime +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public Timestamp getcCommentTime() {
        return cCommentTime;
    }

    public void setcCommentTime(Timestamp cCommentTime) {
        this.cCommentTime = cCommentTime;
    }
}