package com.wsz.medicine.domain;

public class DrugToBuy {
    private Long drugId;

    private String drugName;

    private String drugPrice;

    private String sortName;

    private Integer quantity;

    @Override
    public String toString() {
        return "DrugToBuy{" +
                "drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", drugPrice='" + drugPrice + '\'' +
                ", sortName='" + sortName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(String drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
