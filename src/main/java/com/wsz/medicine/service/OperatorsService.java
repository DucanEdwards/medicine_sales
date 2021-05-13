package com.wsz.medicine.service;

import com.wsz.medicine.domain.Operators;
import com.wsz.medicine.domain.OperatorsExample;
import com.wsz.medicine.exception.BusinessException;
import com.wsz.medicine.exception.BusinessExceptionCode;
import com.wsz.medicine.mapper.OperatorsMapper;
import com.wsz.medicine.mapper.OprOrderMapperCust;
import com.wsz.medicine.request.OperatorsReq;
import com.wsz.medicine.request.OprLoginReq;
import com.wsz.medicine.resp.OperatorsResp;
import com.wsz.medicine.resp.OprLoginResp;
import com.wsz.medicine.resp.OprOrderResp;
import com.wsz.medicine.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OperatorsService {
    @Resource
    private OperatorsMapper operatorsMapper;

    @Resource
    private OprOrderMapperCust oprOrderMapperCust;

    private static final Logger LOG = LoggerFactory.getLogger(OperatorsService.class);

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

    /**
     * 查询登录名
     * @param oprid
     * @return
     */
    public Operators selectByLoginName(Long oprid) {
        OperatorsExample operatorsExample = new OperatorsExample();
        OperatorsExample.Criteria criteria = operatorsExample.createCriteria();
        criteria.andOprIdEqualTo(oprid);
        List<Operators> operatorsList = operatorsMapper.selectByExample(operatorsExample);
        if (CollectionUtils.isEmpty(operatorsList)) {
            return null;
        }
        else {
            return operatorsList.get(0);
        }
    }

    /**
     * 登录
     */
    public OprLoginResp login(OprLoginReq req){
        Operators oprDb = selectByLoginName(req.getOprId());
        if (ObjectUtils.isEmpty(oprDb)) {
            //用户名不存在
            LOG.info("操作员id不存在,{}",req.getOprId());
            throw new BusinessException(BusinessExceptionCode.OPR_LOGIN_ID_NOTEXIST);
        }
        else{
            if (oprDb.getOprPassword().equals(req.getOprPassword())) {
                // 登录成功
                OprLoginResp oprLoginResp=CopyUtil.copy(oprDb,OprLoginResp.class);
                return oprLoginResp;
            }
            else{
                // 密码不对
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", req.getOprPassword(), oprDb.getOprPassword());
                throw new BusinessException(BusinessExceptionCode.OPR_LOGIN_FAIL);
            }
        }
    }

}
