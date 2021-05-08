package com.wsz.medicine.service;

import com.wsz.medicine.mapper.AnalysisMapperCust;
import com.wsz.medicine.resp.AnalysisResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnalysisService {
    @Resource
    private AnalysisMapperCust analysisMapperCust;

    public List<AnalysisResp> getAnalysis() {
        return analysisMapperCust.getAnalysis();
    }
}
