package com.wsz.medicine.service;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.mapper.SaleOrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleOrderService {
    @Resource
    private SaleOrderMapper saleOrderMapper;

    public List<SaleOrder> list() {
        return  saleOrderMapper.selectByExample(null);
    }
}
