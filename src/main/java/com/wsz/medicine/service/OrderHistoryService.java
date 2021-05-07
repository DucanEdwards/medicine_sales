package com.wsz.medicine.service;

import com.wsz.medicine.mapper.OrderHistoryMapperCust;
import com.wsz.medicine.resp.DrugInfoResp;
import com.wsz.medicine.resp.OrderHistoryResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderHistoryService {
    @Resource
    private OrderHistoryMapperCust orderHistoryMapperCust;

    public List<OrderHistoryResp> list(Long custId) {
        return orderHistoryMapperCust.list(custId);
    }
}
