package com.wsz.medicine.timedtask;

import com.wsz.medicine.service.AnalysisService;
import com.wsz.medicine.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AnalysisTask {
    private static final Logger LOG = LoggerFactory.getLogger(AnalysisTask.class);

    @Resource
    private AnalysisService analysisService;

    @Resource
    private SnowFlake snowFlake;

    @Scheduled(cron = "0/5 * * * * ?")
    public void doSnapshot() {
        MDC.put("LOG_ID", String.valueOf(snowFlake.nextId()));
        LOG.info("更新数据开始");
        Long start = System.currentTimeMillis();
        analysisService.getNowAnalysis();
        LOG.info("更新数据结束，耗时：{}毫秒", System.currentTimeMillis() - start);
    }
}
