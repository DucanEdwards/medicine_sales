package com.wsz.medicine.mapper;

import com.wsz.medicine.domain.Analysis;
import com.wsz.medicine.domain.AnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnalysisMapper {
    long countByExample(AnalysisExample example);

    int deleteByExample(AnalysisExample example);

    int deleteByPrimaryKey(Long analysisId);

    int insert(Analysis record);

    int insertSelective(Analysis record);

    List<Analysis> selectByExample(AnalysisExample example);

    Analysis selectByPrimaryKey(Long analysisId);

    int updateByExampleSelective(@Param("record") Analysis record, @Param("example") AnalysisExample example);

    int updateByExample(@Param("record") Analysis record, @Param("example") AnalysisExample example);

    int updateByPrimaryKeySelective(Analysis record);

    int updateByPrimaryKey(Analysis record);
}