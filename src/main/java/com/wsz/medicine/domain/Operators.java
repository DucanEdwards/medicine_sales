package com.wsz.medicine.domain;

import java.util.Date;

public class Operators {
    private Long oprId;

    private String oprName;

    private String oprTel;

    private String oprSex;

    private String oprPay;

    private String oprPassword;

    private Date oprHiredate;

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

    public String getOprTel() {
        return oprTel;
    }

    public void setOprTel(String oprTel) {
        this.oprTel = oprTel;
    }

    public String getOprSex() {
        return oprSex;
    }

    public void setOprSex(String oprSex) {
        this.oprSex = oprSex;
    }

    public String getOprPay() {
        return oprPay;
    }

    public void setOprPay(String oprPay) {
        this.oprPay = oprPay;
    }

    public String getOprPassword() {
        return oprPassword;
    }

    public void setOprPassword(String oprPassword) {
        this.oprPassword = oprPassword;
    }

    public Date getOprHiredate() {
        return oprHiredate;
    }

    public void setOprHiredate(Date oprHiredate) {
        this.oprHiredate = oprHiredate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oprId=").append(oprId);
        sb.append(", oprName=").append(oprName);
        sb.append(", oprTel=").append(oprTel);
        sb.append(", oprSex=").append(oprSex);
        sb.append(", oprPay=").append(oprPay);
        sb.append(", oprPassword=").append(oprPassword);
        sb.append(", oprHiredate=").append(oprHiredate);
        sb.append("]");
        return sb.toString();
    }
}