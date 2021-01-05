package com.example.javabbs.domain;

public class Jurisdiction {
    private Integer jId;
    private String jName;

    public Jurisdiction() {
    }

    public Jurisdiction(Integer jId, String jName) {
        this.jId = jId;
        this.jName = jName;
    }

    @Override
    public String toString() {
        return "Jurisdiction{" +
                "jId=" + jId +
                ", jName='" + jName + '\'' +
                '}';
    }

    public Integer getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName;
    }
}
