package com.wsz.medicine.resp;

public class OprOrderResp {
    private String oprName;

    private Long orderId;

    private String custName;

    private String state;

    @Override
    public String toString() {
        return "OprOrderResp{" +
                "oprName='" + oprName + '\'' +
                ", orderId=" + orderId +
                ", custName='" + custName + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
}
