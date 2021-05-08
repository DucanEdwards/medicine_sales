package com.wsz.medicine.mapper;

import com.wsz.medicine.resp.SupplierOrderResp;

import java.util.List;

public interface SupplierOrderMapperCust {
    List<SupplierOrderResp> getSupplierOrder(Long supplierId);
}
