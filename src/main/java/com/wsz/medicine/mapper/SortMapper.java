package com.wsz.medicine.mapper;

import com.wsz.medicine.domain.Sort;
import com.wsz.medicine.domain.SortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SortMapper {
    long countByExample(SortExample example);

    int deleteByExample(SortExample example);

    int deleteByPrimaryKey(Long sortId);

    int insert(Sort record);

    int insertSelective(Sort record);

    List<Sort> selectByExample(SortExample example);

    Sort selectByPrimaryKey(Long sortId);

    int updateByExampleSelective(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByExample(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByPrimaryKeySelective(Sort record);

    int updateByPrimaryKey(Sort record);
}