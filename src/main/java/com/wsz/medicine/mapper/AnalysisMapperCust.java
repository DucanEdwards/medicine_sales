package com.wsz.medicine.mapper;

import com.wsz.medicine.resp.AnalysisResp;

import java.util.List;

public interface AnalysisMapperCust {
    List<AnalysisResp> getAnalysis();

    public void getNowAnalysis();
}
