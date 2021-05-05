package com.wsz.medicine.req;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CustLoginReq {
    @NotNull(message = "【顾客ID】不能为空")
    private Long custId;

    @NotEmpty(message = "【密码】不能为空")
    private String custPassword;

    @Override
    public String toString() {
        return "CustLoginReq{" +
                "custId=" + custId +
                ", custPassword='" + custPassword + '\'' +
                '}';
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
}
