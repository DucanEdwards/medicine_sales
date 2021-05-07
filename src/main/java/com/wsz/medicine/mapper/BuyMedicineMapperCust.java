package com.wsz.medicine.mapper;

import com.wsz.medicine.domain.DrugToBuy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyMedicineMapperCust {
    void buy(Long custId,List<DrugToBuy> list);
}
