package com.wsz.medicine.mapper;

import com.wsz.medicine.resp.OrderDetailResp;

import java.util.List;

public interface SaleOrderDetailMapperCust {
    List<OrderDetailResp> getDetail(Long id);
}
