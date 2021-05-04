package com.wsz.medicine.service;

import com.wsz.medicine.domain.Operators;
import com.wsz.medicine.domain.OperatorsExample;
import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.domain.SaleOrderExample;
import com.wsz.medicine.mapper.OperatorsMapper;
import com.wsz.medicine.mapper.OprOrderMapperCust;
import com.wsz.medicine.req.OperatorsReq;
import com.wsz.medicine.resp.OperatorsResp;
import com.wsz.medicine.resp.OprOrderResp;
import com.wsz.medicine.resp.SaleOrderResp;
import com.wsz.medicine.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OperatorsService {
    @Resource
    private OperatorsMapper operatorsMapper;

    @Resource
    private OprOrderMapperCust oprOrderMapperCust;

    public List<OperatorsResp> listopr(OperatorsReq req) {
        OperatorsExample operatorsExample=new OperatorsExample();
        OperatorsExample.Criteria criteria=operatorsExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getOprId())) {
            criteria.andOprIdEqualTo(req.getOprId());
        }
        if (!ObjectUtils.isEmpty(req.getOprName())) {
            criteria.andOprNameEqualTo(req.getOprName());
        }
        List<Operators> operatorsList = operatorsMapper.selectByExample(operatorsExample);

        List<OperatorsResp> respList = CopyUtil.copyList(operatorsList, OperatorsResp.class);

        return respList;
    }

    public List<OprOrderResp> oprorder(Long oprid) {
        return oprOrderMapperCust.oprOrder(oprid);
    }

}
