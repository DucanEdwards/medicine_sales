package com.wsz.medicine.controller;

import com.wsz.medicine.req.OperatorsReq;
import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.resp.*;
import com.wsz.medicine.service.OperatorsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/opr")
public class OperatersController {
    @Resource
    private OperatorsService operatorsService;

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
}
