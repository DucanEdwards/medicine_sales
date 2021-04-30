package com.wsz.medicine.mapper;

import com.wsz.medicine.domain.SaleOrder;
import com.wsz.medicine.domain.SaleOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOrderMapper {
    long countByExample(SaleOrderExample example);

    int deleteByExample(SaleOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    List<SaleOrder> selectByExample(SaleOrderExample example);

    SaleOrder selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") SaleOrder record, @Param("example") SaleOrderExample example);

    int updateByExample(@Param("record") SaleOrder record, @Param("example") SaleOrderExample example);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}