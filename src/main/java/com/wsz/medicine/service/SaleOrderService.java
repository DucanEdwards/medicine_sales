package com.wsz.medicine.service;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.domain.SaleOrderExample;
import com.wsz.medicine.mapper.SaleOrderDetailMapperCust;
import com.wsz.medicine.mapper.SaleOrderMapper;
import com.wsz.medicine.request.SaleOrderReq;
import com.wsz.medicine.resp.OrderDetailResp;
import com.wsz.medicine.resp.SaleOrderResp;
import com.wsz.medicine.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class SaleOrderService {
    @Resource
    private SaleOrderMapper saleOrderMapper;

    @Resource
    private SaleOrderDetailMapperCust saleOrderDetailMapperCust;

    public List<SaleOrderResp> list(SaleOrderReq req) {
        SaleOrderExample saleOrderExample=new SaleOrderExample();
        SaleOrderExample.Criteria criteria=saleOrderExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getCustId())) {
            criteria.andCustIdEqualTo(req.getCustId());
        }
        List<SaleOrder> saleOrdersList = saleOrderMapper.selectByExample(saleOrderExample);

        List<SaleOrderResp> respList = CopyUtil.copyList(saleOrdersList, SaleOrderResp.class);

        return respList;
    }

    public List<OrderDetailResp> getDetail(Long id) {
        return saleOrderDetailMapperCust.getDetail(id);
    }

    //  操作员确认后更改订单状态和日期
    public String updateState(Long orderId) {
        SaleOrderExample saleOrderExample=new SaleOrderExample();
        SaleOrderExample.Criteria criteria=saleOrderExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<SaleOrder> saleOrders=saleOrderMapper.selectByExample(saleOrderExample);
        if (saleOrders.get(0)!=null) {
            SaleOrder saleOrder=saleOrders.get(0);
            saleOrder.setState("1");
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
            saleOrder.setOptTime(new Date());
            saleOrderMapper.updateByPrimaryKey(saleOrder);
            return "操作完成,订单已确认";
        }
        else {
            return "操作失败";
        }
    }

}
