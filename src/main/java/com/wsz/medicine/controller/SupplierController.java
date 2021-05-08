package com.wsz.medicine.controller;

import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.req.SupplierReq;
import com.wsz.medicine.resp.CommonResp;
import com.wsz.medicine.resp.SaleOrderResp;
import com.wsz.medicine.resp.SupplierOrderResp;
import com.wsz.medicine.resp.SupplierResp;
import com.wsz.medicine.service.SupplierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Resource
    private SupplierService supplierService;

    @GetMapping("/list")
    public CommonResp list(SupplierReq req) {
        CommonResp<List<SupplierResp>> saleOrderCommonResp = new CommonResp<>();
        List<SupplierResp> list=supplierService.list(req);
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }

    @GetMapping("/order/{supplierId}")
    public CommonResp order(@PathVariable Long supplierId) {
        CommonResp<List<SupplierOrderResp>> saleOrderCommonResp = new CommonResp<>();
        List<SupplierOrderResp> list=supplierService.getSupplierOrder(supplierId);
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }
}
