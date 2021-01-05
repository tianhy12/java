package com.example.javabbs.domain;

public class Authority_Jursdiction {
    private Integer aj_Id;
    private Jurisdiction jurisdiction;
    private Authority authority;

    @Override
    public String toString() {
        return "Authority_Jursdiction{" +
                "aj_Id=" + aj_Id +
                ", jurisdiction=" + jurisdiction +
                ", authority=" + authority +
                '}';
    }

    public Integer getAj_Id() {
        return aj_Id;
    }

    public void setAj_Id(Integer aj_Id) {
        this.aj_Id = aj_Id;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public Authority_Jursdiction() {
    }

    public Authority_Jursdiction(Integer aj_Id, Jurisdiction jurisdiction, Authority authority) {
        this.aj_Id = aj_Id;
        this.jurisdiction = jurisdiction;
        this.authority = authority;
    }
}
