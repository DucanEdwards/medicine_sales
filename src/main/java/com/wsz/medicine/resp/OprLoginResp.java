package com.wsz.medicine.resp;

import java.util.Date;

public class OprLoginResp {
    private Long oprId;

    private String oprName;

    private String token;

    @Override
    public String toString() {
        return "OprLoginResp{" +
                "oprId=" + oprId +
                ", oprName='" + oprName + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getOprId() {
        return oprId;
    }

    public void setOprId(Long oprId) {
        this.oprId = oprId;
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
    }

}