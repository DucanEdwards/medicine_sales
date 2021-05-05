package com.wsz.medicine.req;

import java.util.Date;

public class DrugReq {

    private String drugName;

    private Long sortId;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugName=").append(drugName);
        sb.append(", sortId=").append(sortId);
        sb.append("]");
        return sb.toString();
    }
}