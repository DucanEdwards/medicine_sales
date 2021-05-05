package com.wsz.medicine.resp;

public class CustLoginResp {
    private Long custId;

    private String custName;

    private String token;

    @Override
    public String toString() {
        return "CustLoginResp{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}