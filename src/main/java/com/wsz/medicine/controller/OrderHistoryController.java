package com.wsz.medicine.controller;

import com.wsz.medicine.resp.CommonResp;
import com.wsz.medicine.resp.DrugInfoResp;
import com.wsz.medicine.resp.OrderHistoryResp;
import com.wsz.medicine.service.OrderHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/history")
public class OrderHistoryController {
    @Resource
    private OrderHistoryService orderHistoryService;

    @GetMapping("/list/{custId}")
    public CommonResp list(@PathVariable Long custId) {
        CommonResp<List<OrderHistoryResp>> saleOrderCommonResp = new CommonResp<>();
        List<OrderHistoryResp> list=orderHistoryService.list(custId);
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }

    @DeleteMapping("delete/{orderId}")
    public CommonResp delete(@PathVariable Long orderId) {
        CommonResp resp = new CommonResp<>();
        orderHistoryService.delete(orderId);
        return resp;
    }
}
