package com.wsz.medicine.controller;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.resp.CommonResp;
import com.wsz.medicine.service.SaleOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SaleOrderController {
    @Resource
    private SaleOrderService saleOrderService;

    @GetMapping("/saleorder/list")
    public CommonResp list() {
        CommonResp<List<SaleOrder>> saleOrderCommonResp = new CommonResp<>();
        List<SaleOrder> list=saleOrderService.list();
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }

}
