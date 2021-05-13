package com.wsz.medicine.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class OprLoginReq {
    @NotNull(message = "【操作员ID】不能为空")
    private Long oprId;

    @NotEmpty(message = "【密码】不能为空")
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
