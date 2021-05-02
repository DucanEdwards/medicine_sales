package com.wsz.medicine.service;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.domain.SaleOrderExample;
import com.wsz.medicine.mapper.SaleOrderMapper;
import com.wsz.medicine.req.SaleOrderReq;
import com.wsz.medicine.resp.SaleOrderResp;
import com.wsz.medicine.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleOrderService {
    @Resource
    private SaleOrderMapper saleOrderMapper;

    public List<SaleOrderResp> list(SaleOrderReq req) {
        SaleOrderExample saleOrderExample=new SaleOrderExample();
        SaleOrderExample.Criteria criteria=saleOrderExample.createCriteria();
        criteria.andCustIdEqualTo(req.getCustId());
        List<SaleOrder> saleOrdersList = saleOrderMapper.selectByExample(saleOrderExample);

//        List<SaleOrderResp> respList=new ArrayList<>();
//        for (SaleOrder saleOrder:saleOrdersList) {
//            SaleOrderResp saleOrderResp=new SaleOrderResp();
//            BeanUtils.copyProperties(saleOrder,saleOrderResp);
//            respList.add(saleOrderResp);
//        }
        List<SaleOrderResp> respList = CopyUtil.copyList(saleOrdersList, SaleOrderResp.class);

        return respList;
    }

}