package com.wsz.medicine.service;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.domain.SaleOrderExample;
import com.wsz.medicine.exception.BusinessException;
import com.wsz.medicine.exception.BusinessExceptionCode;
import com.wsz.medicine.mapper.OrderHistoryMapperCust;
import com.wsz.medicine.mapper.SaleOrderMapper;
import com.wsz.medicine.resp.OrderHistoryResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OrderHistoryService {
    @Resource
    private OrderHistoryMapperCust orderHistoryMapperCust;

    @Resource
    private SaleOrderMapper saleOrderMapper;

    private static final Logger LOG = LoggerFactory.getLogger(OrderHistoryService.class);

    public List<OrderHistoryResp> list(Long custId) {
        return orderHistoryMapperCust.list(custId);
    }

    // 查询订单号对应的记录
    public SaleOrder selectByOrderId(Long orderId) {
        SaleOrderExample saleOrderExample = new SaleOrderExample();
        SaleOrderExample.Criteria criteria = saleOrderExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<SaleOrder> saleOrders = saleOrderMapper.selectByExample(saleOrderExample);
        if (CollectionUtils.isEmpty(saleOrders)) {
            return null;
        }
        else {
            return saleOrders.get(0);
        }
    }

    public void delete(Long orderId){
        SaleOrder saledb = selectByOrderId(orderId);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        // 获取七天前的时间
        Date before7days = calendar.getTime();
        if (saledb.getOptTime()==null || saledb.getOptTime().getTime()>=before7days.getTime()) {
            // 可以删除
            orderHistoryMapperCust.delete(orderId);
        }
        else{
            // 不可以删除
            LOG.info("超出时间范围，不可取消订单");
            throw new BusinessException(BusinessExceptionCode.OUT_OF_TIME_RANGE);
        }
    }
}
