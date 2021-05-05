package com.wsz.medicine.resp;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DrugInfoResp {
    private String drugName;

    private String drugPrice;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date expireDate;

    private String sortName;

    @Override
    public String toString() {
        return "DrugInfoResp{" +
                "drugName='" + drugName + '\'' +
                ", drugPrice='" + drugPrice + '\'' +
                ", expireDate=" + expireDate +
                ", sortName='" + sortName + '\'' +
                '}';
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

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
}
