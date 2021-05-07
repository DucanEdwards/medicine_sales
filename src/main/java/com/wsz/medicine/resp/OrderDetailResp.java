package com.wsz.medicine.resp;

public class OrderDetailResp {
    private Long orderId;

    private String oprName;

    private String custName;

    private String custTel;

    private String drugName;

    private Integer drugNum;

    private String drugPrice;

    @Override
    public String toString() {
        return "OrderDetailResp{" +
                "orderId=" + orderId +
                ", oprName='" + oprName + '\'' +
                ", custName='" + custName + '\'' +
                ", custTel='" + custTel + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugNum=" + drugNum +
                ", drugPrice='" + drugPrice + '\'' +
                '}';
    }

    public String getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(String drugPrice) {
        this.drugPrice = drugPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
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

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(Integer drugNum) {
        this.drugNum = drugNum;
    }

}
