package com.wsz.medicine.req;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class OprLoginReq {

    private Long oprId;

    private String oprPassword;

    @Override
    public String toString() {
        return "OprLoginReq{" +
                "oprId=" + oprId +
                ", oprPassword='" + oprPassword + '\'' +
                '}';
    }

    public Long getOprId() {
        return oprId;
    }

    public void setOprId(Long oprId) {
        this.oprId = oprId;
    }

    public String getOprPassword() {
        return oprPassword;
    }

    public void setOprPassword(String oprPassword) {
        this.oprPassword = oprPassword;
    }
}
