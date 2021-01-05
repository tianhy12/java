package com.example.javabbs.domain;

public class Users_Jurisdiction {
    private Integer uj_Id;
    private User user;
    private Jurisdiction jurisdiction;

    public Integer getUj_Id() {
        return uj_Id;
    }

    public void setUj_Id(Integer uj_Id) {
        this.uj_Id = uj_Id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Users_Jurisdiction() {
    }

    public Users_Jurisdiction(Integer uj_Id, User user, Jurisdiction jurisdiction) {
        this.uj_Id = uj_Id;
        this.user = user;
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "User_Jurisdiction{" +
                "uj_Id=" + uj_Id +
                ", user=" + user +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}
