package com.example.javabbs.domain;

public class Authority {
    private  Integer aId;

    private String aAuthority;


    public Authority() {
    }

    public Authority(Integer aId, String aAuthority) {
        this.aId = aId;
        this.aAuthority = aAuthority;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaAuthority() {
        return aAuthority;
    }

    public void setaAuthority(String aAuthority) {
        this.aAuthority = aAuthority;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "aId=" + aId +
                ", aAuthority='" + aAuthority + '\'' +
                '}';
    }
}