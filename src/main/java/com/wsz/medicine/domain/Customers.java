package com.wsz.medicine.domain;

public class Customers {
    private Long custId;

    private String custName;

    private String custTel;

    private String custPassword;

    private String custCardnum;

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

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public String getCustCardnum() {
        return custCardnum;
    }

    public void setCustCardnum(String custCardnum) {
        this.custCardnum = custCardnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custTel=").append(custTel);
        sb.append(", custPassword=").append(custPassword);
        sb.append(", custCardnum=").append(custCardnum);
        sb.append("]");
        return sb.toString();
    }
}