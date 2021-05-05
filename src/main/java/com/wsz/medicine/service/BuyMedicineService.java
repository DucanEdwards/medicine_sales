package com.wsz.medicine.service;

import com.wsz.medicine.mapper.DrugInfoMapperCust;
import com.wsz.medicine.resp.DrugInfoResp;
import com.wsz.medicine.resp.OrderDetailResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuyMedicineService {
    @Resource
    private DrugInfoMapperCust drugInfoMapperCust;

    public List<DrugInfoResp> list() {
        return drugInfoMapperCust.list();
    }
}
