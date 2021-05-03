package com.wsz.medicine.mapper;

import com.wsz.medicine.domain.Customers;
import com.wsz.medicine.domain.CustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomersMapper {
    long countByExample(CustomersExample example);

    int deleteByExample(CustomersExample example);

    int deleteByPrimaryKey(Long custId);

    int insert(Customers record);

    int insertSelective(Customers record);

    List<Customers> selectByExample(CustomersExample example);

    Customers selectByPrimaryKey(Long custId);

    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKey(Customers record);
}