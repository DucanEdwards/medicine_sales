package com.wsz.medicine.mapper;

import com.wsz.medicine.domain.Operators;
import com.wsz.medicine.domain.OperatorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatorsMapper {
    long countByExample(OperatorsExample example);

    int deleteByExample(OperatorsExample example);

    int deleteByPrimaryKey(Long oprId);

    int insert(Operators record);

    int insertSelective(Operators record);

    List<Operators> selectByExample(OperatorsExample example);

    Operators selectByPrimaryKey(Long oprId);

    int updateByExampleSelective(@Param("record") Operators record, @Param("example") OperatorsExample example);

    int updateByExample(@Param("record") Operators record, @Param("example") OperatorsExample example);

    int updateByPrimaryKeySelective(Operators record);

    int updateByPrimaryKey(Operators record);
}