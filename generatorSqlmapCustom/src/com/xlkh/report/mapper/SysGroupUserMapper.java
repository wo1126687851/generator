package com.xlkh.report.mapper;

import com.xlkh.report.pojo.SysGroupUser;
import com.xlkh.report.pojo.SysGroupUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysGroupUserMapper {
    int countByExample(SysGroupUserExample example);

    int deleteByExample(SysGroupUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysGroupUser record);

    int insertSelective(SysGroupUser record);

    List<SysGroupUser> selectByExample(SysGroupUserExample example);

    SysGroupUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysGroupUser record, @Param("example") SysGroupUserExample example);

    int updateByExample(@Param("record") SysGroupUser record, @Param("example") SysGroupUserExample example);

    int updateByPrimaryKeySelective(SysGroupUser record);

    int updateByPrimaryKey(SysGroupUser record);
}