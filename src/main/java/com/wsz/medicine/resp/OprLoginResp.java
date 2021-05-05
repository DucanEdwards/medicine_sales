package com.wsz.medicine.resp;

import java.util.Date;

public class OprLoginResp {
    private Long oprId;

    private String oprName;

    public Long getOprId() {
        return oprId;
    }

    public void setOprId(Long oprId) {
        this.oprId = oprId;
    }

    public String getOprName() {
        return oprName;
    }

    public void setOprName(String oprName) {
        this.oprName = oprName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oprId=").append(oprId);
        sb.append(", oprName=").append(oprName);
        sb.append("]");
        return sb.toString();
    }
}