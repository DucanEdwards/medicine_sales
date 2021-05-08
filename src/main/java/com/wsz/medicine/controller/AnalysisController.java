package com.wsz.medicine.controller;

import com.wsz.medicine.resp.AnalysisResp;
import com.wsz.medicine.resp.CommonResp;
import com.wsz.medicine.service.AnalysisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/analysis")
public class AnalysisController {
    @Resource
    private AnalysisService analysisService;

    @GetMapping("/get-analysis")
    public CommonResp getAnalysis() {
        List<AnalysisResp> statisticResp = analysisService.getAnalysis();
        CommonResp<List<AnalysisResp>> commonResp = new CommonResp<>();
        commonResp.setContent(statisticResp);
        return commonResp;
    }
}
