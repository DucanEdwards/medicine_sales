package com.wsz.medicine.resp;

import java.util.Date;

public class SaleOrderResp {
    private Long orderId;

    private Long custId;

    private Long oprId;

    private Date optTime;

    private String state;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getOprId() {
        return oprId;
    }

    public void setOprId(Long oprId) {
        this.oprId = oprId;
    }

    public Date getOptTime() {
        return optTime;
    }

    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", custId=").append(custId);
        sb.append(", oprId=").append(oprId);
        sb.append(", optTime=").append(optTime);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}