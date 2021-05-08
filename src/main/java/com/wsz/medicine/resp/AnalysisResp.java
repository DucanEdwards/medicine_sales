package com.wsz.medicine.resp;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class AnalysisResp {
    private Long analysisId;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date today;

    private Long orderSum;

    private Long orderSum30;

    private String salesSum;

    private String salesSum30;

    private String loyalCustomer;

    public Long getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public Long getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(Long orderSum) {
        this.orderSum = orderSum;
    }

    public Long getOrderSum30() {
        return orderSum30;
    }

    public void setOrderSum30(Long orderSum30) {
        this.orderSum30 = orderSum30;
    }

    public String getSalesSum() {
        return salesSum;
    }

    public void setSalesSum(String salesSum) {
        this.salesSum = salesSum;
    }

    public String getSalesSum30() {
        return salesSum30;
    }

    public void setSalesSum30(String salesSum30) {
        this.salesSum30 = salesSum30;
    }

    public String getLoyalCustomer() {
        return loyalCustomer;
    }

    public void setLoyalCustomer(String loyalCustomer) {
        this.loyalCustomer = loyalCustomer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", analysisId=").append(analysisId);
        sb.append(", today=").append(today);
        sb.append(", orderSum=").append(orderSum);
        sb.append(", orderSum30=").append(orderSum30);
        sb.append(", salesSum=").append(salesSum);
        sb.append(", salesSum30=").append(salesSum30);
        sb.append(", loyalCustomer=").append(loyalCustomer);
        sb.append("]");
        return sb.toString();
    }
}