package com.example.javabbs.domain;

public class Login {
    private User user;
    private String uUserName;
    private String lPassword;

    public Login() {
    }

    public Login(User user, String uUserName, String lPassword) {
        this.user = user;
        this.uUserName = uUserName;
        this.lPassword = lPassword;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public String getlPassword() {
        return lPassword;
    }

    public void setlPassword(String lPassword) {
        this.lPassword = lPassword;
    }
}
