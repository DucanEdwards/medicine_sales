package com.wsz.medicine.controller;

import com.alibaba.fastjson.JSONObject;
import com.wsz.medicine.req.CustLoginReq;
import com.wsz.medicine.req.OprLoginReq;
import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.resp.*;
import com.wsz.medicine.service.BuyMedicineService;
import com.wsz.medicine.service.SaleOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import com.wsz.medicine.util.SnowFlake;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/drug")
public class BuyMedicineController {
    @Resource
    private BuyMedicineService buyMedicineService;

    @Resource
    private SnowFlake snowFlake;

    @Resource
    private RedisTemplate redisTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(BuyMedicineController.class);

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<DrugInfoResp>> saleOrderCommonResp = new CommonResp<>();
        List<DrugInfoResp> list=buyMedicineService.list();
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }

    @PostMapping("/login")
    public CommonResp login(@Valid @RequestBody CustLoginReq req) {
        CommonResp<CustLoginResp> resp = new CommonResp<>();
        CustLoginResp custLoginResp=buyMedicineService.login(req);

        Long token=snowFlake.nextId();
        LOG.info("生成单点登录token：{}，并放入redis中", token);
        custLoginResp.setToken(token.toString());
        redisTemplate.opsForValue().set(token.toString(), JSONObject.toJSONString(custLoginResp), 3600, TimeUnit.SECONDS);

        resp.setContent(custLoginResp);
        return resp;
    }

    @GetMapping("/logout/{token}")
    public CommonResp logout(@PathVariable String token) {
        CommonResp resp = new CommonResp<>();
        redisTemplate.delete(token);
        LOG.info("从redis中删除token: {}", token);
        return resp;
    }
}
