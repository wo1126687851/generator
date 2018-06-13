package com.xlkh.report.mapper;

import com.xlkh.report.pojo.LogVisit;
import com.xlkh.report.pojo.LogVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogVisitMapper {
    int countByExample(LogVisitExample example);

    int deleteByExample(LogVisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogVisit record);

    int insertSelective(LogVisit record);

    List<LogVisit> selectByExample(LogVisitExample example);

    LogVisit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogVisit record, @Param("example") LogVisitExample example);

    int updateByExample(@Param("record") LogVisit record, @Param("example") LogVisitExample example);

    int updateByPrimaryKeySelective(LogVisit record);

    int updateByPrimaryKey(LogVisit record);
}