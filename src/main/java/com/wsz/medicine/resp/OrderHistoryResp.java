package com.wsz.medicine.resp;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OrderHistoryResp {
    private Long orderId;

    @Override
    public String toString() {
        return "OrderHistoryResp{" +
                "orderId=" + orderId +
                ", oprId=" + oprId +
                ", custName='" + custName + '\'' +
                ", optTime=" + optTime +
                ", state='" + state + '\'' +
                ", sum=" + sum +
                '}';
    }

    private Long oprId;

    private String custName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date optTime;

    private String state;

    private Double sum;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    public Long getOprId() {
        return oprId;
    }

    public void setOprId(Long oprId) {
        this.oprId = oprId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
