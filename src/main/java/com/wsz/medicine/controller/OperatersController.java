package com.wsz.medicine.controller;

import com.alibaba.fastjson.JSONObject;
import com.wsz.medicine.req.OperatorsReq;
import com.wsz.medicine.req.OprLoginReq;
import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.resp.*;
import com.wsz.medicine.service.OperatorsService;
import com.wsz.medicine.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/opr")
public class OperatersController {
    @Resource
    private OperatorsService operatorsService;

    @Resource
    private SnowFlake snowFlake;

    @Resource
    private RedisTemplate redisTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(OperatersController.class);

    @GetMapping("/list")
    public CommonResp list(OperatorsReq req) {
        CommonResp<List<OperatorsResp>> operatorsCommonResp = new CommonResp<>();
        List<OperatorsResp> list=operatorsService.listopr(req);
        operatorsCommonResp.setContent(list);
        return operatorsCommonResp;
    }

    @GetMapping("/order/{oprid}")
    public CommonResp order(@PathVariable Long oprid) {
        CommonResp<List<OprOrderResp>> oprorderCommonResp = new CommonResp<>();
        List<OprOrderResp> list=operatorsService.oprorder(oprid);
        oprorderCommonResp.setContent(list);
        return oprorderCommonResp;
    }

    @PostMapping("/login")
    public CommonResp login(@Valid @RequestBody OprLoginReq req) {
        CommonResp<OprLoginResp> resp = new CommonResp<>();
        OprLoginResp oprLoginResp=operatorsService.login(req);

        Long token=snowFlake.nextId();
        LOG.info("生成单点登录token：{}，并放入redis中", token);
        oprLoginResp.setToken(token.toString());
        redisTemplate.opsForValue().set(token, JSONObject.toJSONString(oprLoginResp), 3600, TimeUnit.SECONDS);

        resp.setContent(oprLoginResp);
        return resp;
    }

}
