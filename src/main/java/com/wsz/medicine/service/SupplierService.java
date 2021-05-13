package com.wsz.medicine.service;

import com.wsz.medicine.domain.Supplier;
import com.wsz.medicine.domain.SupplierExample;
import com.wsz.medicine.mapper.SupplierMapper;
import com.wsz.medicine.mapper.SupplierOrderMapperCust;
import com.wsz.medicine.request.SupplierReq;
import com.wsz.medicine.resp.SupplierOrderResp;
import com.wsz.medicine.resp.SupplierResp;
import com.wsz.medicine.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupplierService {
    @Resource
    private SupplierMapper supplierMapper;

    @Resource
    private SupplierOrderMapperCust supplierOrderMapperCust;

    public List<SupplierResp> list(SupplierReq req) {
        SupplierExample supplierExample=new SupplierExample();
        SupplierExample.Criteria criteria=supplierExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getSupplierId())) {
            criteria.andSupplierIdEqualTo(req.getSupplierId());
        }
        if (!ObjectUtils.isEmpty(req.getSupplierName())) {
            criteria.andSupplierNameEqualTo(req.getSupplierName());
        }
        List<Supplier> supplierList = supplierMapper.selectByExample(supplierExample);

        List<SupplierResp> respList = CopyUtil.copyList(supplierList, SupplierResp.class);

        return respList;
    }

    public List<SupplierOrderResp> getSupplierOrder(Long supplierId){
        return supplierOrderMapperCust.getSupplierOrder(supplierId);
    }
}
