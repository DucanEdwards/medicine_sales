package com.wsz.medicine.domain;

public class PurchaseOrder {
    private Long purchaseId;

    private Long drugId;

    private Integer drugNum;

    private String purchasePrice;

    private Long oprId;

    private Long supplierId;

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    public Integer getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(Integer drugNum) {
        this.drugNum = drugNum;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getOprId() {
        return oprId;
    }

    public void setOprId(Long oprId) {
        this.oprId = oprId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", purchaseId=").append(purchaseId);
        sb.append(", drugId=").append(drugId);
        sb.append(", drugNum=").append(drugNum);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", oprId=").append(oprId);
        sb.append(", supplierId=").append(supplierId);
        sb.append("]");
        return sb.toString();
    }
}