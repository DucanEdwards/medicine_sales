package com.wsz.medicine.controller;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.resp.CommonResp;
import com.wsz.medicine.resp.OrderDetailResp;
import com.wsz.medicine.resp.SaleOrderResp;
import com.wsz.medicine.service.SaleOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/saleorder")
public class SaleOrderController {
    @Resource
    private SaleOrderService saleOrderService;

    @GetMapping("/list")
    public CommonResp list(SaleOrderReq req) {
        CommonResp<List<SaleOrderResp>> saleOrderCommonResp = new CommonResp<>();
        List<SaleOrderResp> list=saleOrderService.list(req);
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }

    @GetMapping("/detail/{id}")
    public CommonResp detail(@PathVariable Long id) {
        List<OrderDetailResp> list=saleOrderService.getDetail(id);
        CommonResp<List<OrderDetailResp>> saleOrderCommonResp = new CommonResp<>();
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }

    @GetMapping("/confirm-order/{orderId}")
    public CommonResp updateState(@PathVariable Long orderId) {
        CommonResp commonResp = new CommonResp<>();
        String message=saleOrderService.updateState(orderId);
        commonResp.setMessage(message);
        return commonResp;
    }

}
