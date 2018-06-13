package com.xlkh.report.mapper;

import com.xlkh.report.pojo.ReportDaily;
import com.xlkh.report.pojo.ReportDailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportDailyMapper {
    int countByExample(ReportDailyExample example);

    int deleteByExample(ReportDailyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReportDaily record);

    int insertSelective(ReportDaily record);

    List<ReportDaily> selectByExample(ReportDailyExample example);

    ReportDaily selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReportDaily record, @Param("example") ReportDailyExample example);

    int updateByExample(@Param("record") ReportDaily record, @Param("example") ReportDailyExample example);

    int updateByPrimaryKeySelective(ReportDaily record);

    int updateByPrimaryKey(ReportDaily record);
}