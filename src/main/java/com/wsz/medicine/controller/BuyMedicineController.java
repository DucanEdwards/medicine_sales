package com.wsz.medicine.controller;

import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.resp.CommonResp;
import com.wsz.medicine.resp.DrugInfoResp;
import com.wsz.medicine.resp.SaleOrderResp;
import com.wsz.medicine.service.BuyMedicineService;
import com.wsz.medicine.service.SaleOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/drug")
public class BuyMedicineController {
    @Resource
    private BuyMedicineService buyMedicineService;

    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<DrugInfoResp>> saleOrderCommonResp = new CommonResp<>();
        List<DrugInfoResp> list=buyMedicineService.list();
        saleOrderCommonResp.setContent(list);
        return saleOrderCommonResp;
    }
}
