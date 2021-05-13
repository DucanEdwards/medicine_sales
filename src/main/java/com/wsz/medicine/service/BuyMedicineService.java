package com.wsz.medicine.service;

import com.wsz.medicine.domain.*;
import com.wsz.medicine.exception.BusinessException;
import com.wsz.medicine.exception.BusinessExceptionCode;
import com.wsz.medicine.mapper.BuyMedicineMapperCust;
import com.wsz.medicine.mapper.CustomersMapper;
import com.wsz.medicine.mapper.DrugInfoMapperCust;
import com.wsz.medicine.request.CustLoginReq;
import com.wsz.medicine.resp.CustLoginResp;
import com.wsz.medicine.resp.DrugInfoResp;
import com.wsz.medicine.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuyMedicineService {
    @Resource
    private DrugInfoMapperCust drugInfoMapperCust;

    @Resource
    private CustomersMapper customersMapper;

    @Resource
    private BuyMedicineMapperCust buyMedicineMapperCust;

    private static final Logger LOG = LoggerFactory.getLogger(BuyMedicineService.class);


    public List<DrugInfoResp> list() {
        return drugInfoMapperCust.list();
    }

    /**
     * 查询登录名
     * @param custid
     * @return
     */
    public Customers selectByLoginName(Long custid) {
        CustomersExample customersExample = new CustomersExample();
        CustomersExample.Criteria criteria = customersExample.createCriteria();
        criteria.andCustIdEqualTo(custid);
        List<Customers> customersList = customersMapper.selectByExample(customersExample);
        if (CollectionUtils.isEmpty(customersList)) {
            return null;
        }
        else {
            return customersList.get(0);
        }
    }

    /**
     * 登录
     */
    public CustLoginResp login(CustLoginReq req){
        Customers custDb = selectByLoginName(req.getCustId());
        if (ObjectUtils.isEmpty(custDb)) {
            //用户名不存在
            LOG.info("顾客id不存在,{}",req.getCustId());
            throw new BusinessException(BusinessExceptionCode.OPR_LOGIN_ID_NOTEXIST);
        }
        else{
            if (custDb.getCustPassword().equals(req.getCustPassword())) {
                // 登录成功
                CustLoginResp custLoginResp= CopyUtil.copy(custDb,CustLoginResp.class);
                return custLoginResp;
            }
            else{
                // 密码不对
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", req.getCustPassword(), custDb.getCustPassword());
                throw new BusinessException(BusinessExceptionCode.OPR_LOGIN_FAIL);
            }
        }
    }

    public void buy(Long custId,List<DrugToBuy> list) {
        buyMedicineMapperCust.buy(custId,list);
    }
}
