package com.wsz.medicine.mapper;

import com.wsz.medicine.resp.OrderHistoryResp;

import java.util.List;

public interface OrderHistoryMapperCust {
    List<OrderHistoryResp> list(Long custId);

    void delete(Long orderId);
}
