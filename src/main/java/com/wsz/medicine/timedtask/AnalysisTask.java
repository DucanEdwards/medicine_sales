package com.wsz.medicine.timedtask;

import com.wsz.medicine.service.AnalysisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AnalysisTask {
    private static final Logger LOG = LoggerFactory.getLogger(AnalysisTask.class);

    @Resource
    private AnalysisService analysisService;

    @Scheduled(cron = "0/5 * * * * ?")
    public void doSnapshot() {
        LOG.info("更新数据开始");
        Long start = System.currentTimeMillis();
        analysisService.getNowAnalysis();
        LOG.info("更新数据结束，耗时：{}毫秒", System.currentTimeMillis() - start);
    }
}
