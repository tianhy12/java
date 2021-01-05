package com.example.javabbs.domain;

public class Useruthority {
    private User user;
    private Authority authority;

    public Useruthority() {
    }

    public Useruthority(User user, Authority authority) {
        this.user = user;
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "Useruthority{" +
                "user=" + user +
                ", authority=" + authority +
                '}';
    }
}
