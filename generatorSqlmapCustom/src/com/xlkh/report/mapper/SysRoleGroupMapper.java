package com.xlkh.report.mapper;

import com.xlkh.report.pojo.SysRoleGroup;
import com.xlkh.report.pojo.SysRoleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleGroupMapper {
    int countByExample(SysRoleGroupExample example);

    int deleteByExample(SysRoleGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleGroup record);

    int insertSelective(SysRoleGroup record);

    List<SysRoleGroup> selectByExample(SysRoleGroupExample example);

    SysRoleGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleGroup record, @Param("example") SysRoleGroupExample example);

    int updateByExample(@Param("record") SysRoleGroup record, @Param("example") SysRoleGroupExample example);

    int updateByPrimaryKeySelective(SysRoleGroup record);

    int updateByPrimaryKey(SysRoleGroup record);
}