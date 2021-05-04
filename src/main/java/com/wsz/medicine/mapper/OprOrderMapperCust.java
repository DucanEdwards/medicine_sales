package com.wsz.medicine.mapper;

import com.wsz.medicine.resp.OprOrderResp;

import java.util.List;

public interface OprOrderMapperCust {

    List<OprOrderResp> oprOrder(Long oprid);
}
