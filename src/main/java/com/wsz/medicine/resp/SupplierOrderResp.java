package com.wsz.medicine.resp;

public class SupplierOrderResp {
    private Long purchaseId;

    private String drugName;

    private String oprName;

    private Integer drugNum;

    private String purchasePrice;

    private String supplierName;

    @Override
    public String toString() {
        return "SupplierOrderResp{" +
                "purchaseId=" + purchaseId +
                ", drugName='" + drugName + '\'' +
                ", oprName='" + oprName + '\'' +
                ", drugNum=" + drugNum +
                ", purchasePrice='" + purchasePrice + '\'' +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
